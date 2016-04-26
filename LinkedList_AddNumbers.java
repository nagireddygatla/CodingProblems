package dataStructures;



/*You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and 
each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8*/
public class LinkedList_AddNumbers {

	 public static ListNodes addTwoNumbers(ListNodes l1, ListNodes l2) {
		 
		 if(l1 == null & l2 == null) return null;
		 if(l1 == null) return l2;
		 if(l2 == null) return l1;
		 
		 int carry=0;
		 int newval =0,a1,a2;
		 ListNodes l3 = new ListNodes(0);
		 ListNodes l4 = l3;
		
	
		 while(l1 != null || l2 != null){
			 
			 a1=l1==null?0:l1.val;
			 a2 =l2==null?0:l2.val;
			newval = a1 + a2 + carry;
			
			if(newval > 9){
				carry = newval / 10;
				newval = newval % 10;	
			}
			else{
				carry=0;
			}
			l4.next = new ListNodes(newval);
			l4 = l4.next;
		
			if(l1!=null)l1 = l1.next;
			if(l2!=null)l2 = l2.next;
		 }
		 if(carry!=0)
		 {
			 l4.next = new ListNodes(carry);
			 l4 = l4.next;
		 }
			 return l3.next;
	    }
	 
	 public static void main(String [] args){
		 
			ListNodes obj1 = new ListNodes(1);
			ListNodes obj2 = new ListNodes(2);
			ListNodes obj3 = new ListNodes(6);
			ListNodes obj4 = new ListNodes(3);
			ListNodes obj5 = new ListNodes(4);
			ListNodes obj6 = new ListNodes(5);
		
			obj1.next  = obj2;
			obj2.next = obj3;
			obj3.next = null;
			obj4.next = obj5;
			obj5.next = obj6;
			obj6.next = null;
			ListNodes res=addTwoNumbers(obj1,obj4);
			
			while(res!=null){
				System.out.println(res.val);
				res = res.next;
				
			}
		 
	 }
	 

}
