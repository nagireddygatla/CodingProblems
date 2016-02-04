package dataStructures;


public class LinkedList_Palindrome {

	   public boolean isPalindrome(StringNode head) {
		  
		   StringNode temp = head;
		   StringNode fast = head;
		   StringNode slow = head;
		   
		   while(fast.next.next!=null){
			   
			   fast = fast.next.next;
			   slow = slow.next;
		   }
		   
		   if(fast.next!=null)
		   {
			   fast = fast.next;
		   }
		   
		  slow.next = null;
		  
			  return false;
	    }
	   
	public static void main(String [] args){
		
		StringNode roots = new StringNode(1);
		StringNode root1 = new StringNode(2);
		StringNode root2 = new StringNode(3);
		StringNode root3 = new StringNode(3);
		StringNode root4 = new StringNode(2);
		StringNode root5 = new StringNode(1);
		roots.next = root1;
		root1.next = root2;
		root2.next = root3;
		root3.next = root4;
		root4.next = root5;
		root5.next = null;
		LinkedList_Palindrome obj = new LinkedList_Palindrome();
		System.out.println(obj.isPalindrome(roots));
		
	}
	
}

class StringNode{
	
	int val;
	StringNode next;
	public StringNode(int x){
		
		this.val = x;
	}
	
	
}