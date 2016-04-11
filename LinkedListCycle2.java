package dataStructures;
import java.util.*;

public class LinkedListCycle2 {
	
	public NodesList returnNode(NodesList head){
		if(head==null)return null;
		
		NodesList fast=head,slow=head;
		
		do{
			if(fast==null || fast.next == null) return null;
			
			fast = fast.next.next;
			slow = slow.next;
			
			
		}while(fast!=slow);
		
		fast = head;
		
		while(fast!=slow){
			
			fast = fast.next;
			slow = slow.next;
		}
		
		return slow;
	}
	
	public static void main(String [] args){
		
		NodesList obj1 = new NodesList(3);
		NodesList obj2 = new NodesList(4);
		NodesList obj3 = new NodesList(5);
		NodesList obj4 = new NodesList(6);
		NodesList obj5 = new NodesList(7);
		obj1.next = obj2;
		obj2.next = obj3;
		obj3.next = obj4;
		obj4.next = obj5;
		obj5.next = obj3;
		
		LinkedListCycle2 obj = new LinkedListCycle2();
		NodesList res = obj.returnNode(obj1);
		System.out.println(res.vals);
		
		
	}

}
