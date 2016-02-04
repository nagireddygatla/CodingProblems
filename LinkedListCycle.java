package dataStructures;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


/*Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?*/
public class LinkedListCycle {

	
	

	 public boolean hasCycle(NodesList head) {
		 
		 if(head==null) return false;
		 NodesList slow=head;
		 NodesList fast=head;
		    do{
		        if(fast.next==null||fast.next.next==null)
		            return false;		        
		        fast=fast.next.next;
		        slow=slow.next;	        
		    }
		    while(fast!=slow);

		    return true;
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
		obj5.next = obj1;
		
		LinkedListCycle obj = new LinkedListCycle();
		boolean res = obj.hasCycle(obj1);
		System.out.println(res);
		
		
	}
	
}
