package dataStructures;



	public class LinkedList_Palindrome {

	   public boolean isPalindrome(StringNode head) {
		  
		   if(head==null)return false;
		   StringNode fast=head;
		   StringNode slow = head;
		   StringNode lastBef = null;
		   while(fast!=null && fast.next!=null){
			   
			   fast = fast.next.next;
			   lastBef = slow;
			   slow = slow.next;
		   }
		   lastBef.next = null;
		   StringNode buff = slow.next;
		   slow.next = null;
		   
		   while(buff!=null){
			   
			   StringNode temp = buff.next;
			   buff.next = slow;
			   slow = buff;
			   buff = temp;
			   
		   }
		   
		   StringNode p1 = head;
		   StringNode p2 = slow;
		   
		   		while(p1!=null && p2!=null){
			   
			   if(p1.val!=p2.val)return false;
			   p1 = p1.next;
			   p2 = p2.next;
			   
		   }
				  return true;
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