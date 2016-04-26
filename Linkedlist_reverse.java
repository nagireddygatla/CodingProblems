package dataStructures;

class testnode{
	int val;
	testnode next;
	
	public testnode(int val){
		
		this.val =val;
	}
	
	
}

public class Linkedlist_reverse {

	//Reverse a linked list - this is little tricky!!
	public testnode reverse(testnode head){
		
		 if(head == null || head.next == null) {
		        return head;
		    }
		 	
		 testnode buffer = head.next;
		 head.next = null;
		 while(true){
			 if(buffer == null){
				 
				 return head;
			 }
			 
			 testnode original = buffer.next;
			 buffer.next = head;
			 head = buffer;
			 buffer = original;
		 }
		   
		
	}
	public testnode reverserecursion(testnode head){
		if(head.next==null)return head;
		
		testnode rem = reverserecursion(head.next);
		head.next.next = head;
		head.next = null;
		return rem;
		
		
	}
	
	public static void main(String [] args){
		
		testnode obj1 = new testnode(1);
		testnode obj2 = new testnode(2);
		testnode obj3 = new testnode(3);
		testnode obj4 = new testnode(4);
		obj1.next = obj2;
		obj2.next = obj3;
		obj3.next = obj4;
		obj4.next = null;
		
		
		Linkedlist_reverse news = new Linkedlist_reverse();
		testnode result = news.reverse(obj1);
		
		while(result!=null){
			System.out.println(result.val);
			result = result.next;

		}
		
		
		
	}

}
