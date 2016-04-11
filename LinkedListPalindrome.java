package dataStructures;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class LinkedListPalindrome {
   public boolean isPalindrome(ListNode head) {
		  
		   if(head==null)return true;
		   ListNode fast=head;
		   ListNode slow = head;
		  
		   while(fast!=null && fast.next!=null){
			   
			   fast = fast.next.next;
			   slow = slow.next;
		   }
		   
		   ListNode buff = slow.next;
		   slow.next = null;
		   
		   while(buff!=null){
			   
			   ListNode temp = buff.next;
			   buff.next = slow;
			   slow = buff;
			   buff = temp;
			   
		   }

		   
		   while(head!=null && slow!=null){
			   
			   if(head.val!=slow.val)return false;
			   head = head.next;
			   slow = slow.next;
			   
		   }
				  return true;
	    }	    
}