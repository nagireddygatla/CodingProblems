package dataStructures;

import java.util.Hashtable;


class NodesList{
	
	int vals;
	NodesList next;
	
	public NodesList(int vals){
		this.vals = vals;
		
	}
	
}

public class Linkedlist_RemoveDuplicates {
	
	public NodesList removeDuplicates(NodesList head){
		Hashtable<Integer, Boolean> has = new Hashtable<Integer, Boolean>();
		NodesList temp = head;
		NodesList acttemp = head;
		while(temp != null){
			//System.out.println(temp.vals);
			if(has.containsKey(temp.vals)){
				acttemp.next = temp.next;
				temp = temp.next;
				
			}
			else{
				acttemp = temp;
				has.put(temp.vals,true);
				temp = temp.next;
			}
		}
		
		return head;
	}
	
	
	public static void main(String args []){
		
		NodesList obj1 = new NodesList(3);
		NodesList obj2 = new NodesList(5);
		NodesList obj3 = new NodesList(3);
		NodesList obj4 = new NodesList(5);
		NodesList obj5 = new NodesList(4);
		obj1.next = obj2;
		obj2.next = obj3;
		obj3.next = obj4;
		obj4.next = obj5;
		obj5.next = null;
		Linkedlist_RemoveDuplicates objects = new Linkedlist_RemoveDuplicates();
		NodesList result = objects.removeDuplicates(obj1);
		while(result != null){
			System.out.println(result.vals);
			result = result.next;
			//System.out.println(result.vals);
		}
		
		
		
	}
	
	
}
