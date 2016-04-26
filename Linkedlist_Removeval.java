package dataStructures;

import java.util.Hashtable;

class ListNodes{

	int val;
	ListNodes next;

	public ListNodes(int x){
		this.val = x;

	}
}

public class Linkedlist_Removeval {
	
	ListNodes head;

	public Linkedlist_Removeval() {
		// TODO Auto-generated constructor stub
	}

	 public ListNodes removeElements(ListNodes head, int val) {	 
			
		 while(head != null && head.val == val) {head = head.next;};
		 if(head == null) {return null;}
		 
		 ListNodes temp = head;
		 ListNodes acttemp = head;
		 
		 while(temp.next != null){
			 if(temp.val == val){
				// ListNodes dest = temp;
				 acttemp.next = temp.next;
				 temp = temp.next;
				// dest = null;
			 }
			 else{
				 acttemp = temp;
				 temp = temp.next;
			 }
	 		}
		 if(temp.next == null && temp.val == val) acttemp.next = null;
		 return head;
		 }
	 
	 
	public static void main(String [] args){
		
		ListNodes obj1 = new ListNodes(1);
		ListNodes obj2 = new ListNodes(2);
		ListNodes obj3 = new ListNodes(6);
		ListNodes obj4 = new ListNodes(3);
		ListNodes obj5 = new ListNodes(4);
		ListNodes obj6 = new ListNodes(5);
		ListNodes obj7 = new ListNodes(6);
		obj1.next  = obj2;
		obj2.next = obj3;
		obj3.next = obj4;
		obj4.next = obj5;
		obj5.next = obj6;
		obj6.next = obj7;
		obj7.next = null;
		Linkedlist_Removeval actobj = new Linkedlist_Removeval();
		ListNodes result = actobj.removeElements(obj1, 6);
		while(result!=null){
			System.out.println(result.val);
			result = result.next;
		}
	}	
}
