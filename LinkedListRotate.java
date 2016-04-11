package dataStructures;

/*Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.*/
public class LinkedListRotate {

	public static ListNode rotateRight(ListNode head, int k){
		
		if(head==null || head.next == null) return head;
		ListNode current = head;
		int size = 1;
		while(current.next!=null){
			current = current.next;
			size = size+1;
		}
		 k = k%size;
		 current.next = head;
		 
		 for(int i = 0; i<size-k;i++){
			 current = current.next;
		 }
		
		head = current.next;
		current.next = null;
		return head;
	}
	
	

}
