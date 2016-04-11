package dataStructures;
import java.util.*;
public class LinkedListIntersection {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
		
		Set<ListNode> store = new HashSet<ListNode>();
		ListNode temp1 = headA;
		while(temp1!=null){
			
			store.add(temp1);	
			temp1 = temp1.next;
		}
		ListNode temp2 = headB;
		
		while(temp2!=null){
			if(!store.add(temp2))
				return temp2;
			temp2 = temp2.next;
		}
		
		return null;
	}
	
	//Alternate efficient Solution
/*	1) When the pointer X in shorter list reaches the end, the pointer Y in the longer list 
 * will have len(longer) - len(shorter) left. Put the pointer X to the head of the longer list, then when Y reaches its end, 
 * X already traveled len(longer)-len(shorter). Then put Y to the head of shorter list.

	2) Now X and Y have the same distance to the end: find the intersection where X = Y.*/
	public ListNode getIntesectionNod(ListNode headA, ListNode headB){
		
		ListNode temp1 = headA;
		ListNode temp2 = headB;
		
		while(temp1!=temp2){
			temp1 = (temp1==null)?headB:temp1.next;
			temp2 = (temp2==null)?headA:temp2.next;
		}
		
		return temp1;
	}
	
	
	public static void main(String [] args){
		ListNode head1 = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		head1.next = two;
		two.next = three;
		three.next = four;
		four.next = null;
		
		ListNode head2 = new ListNode(1);		
		ListNode five = new ListNode(3);
		head2.next = five;
		five.next = two;
		System.out.println(new LinkedListIntersection().getIntersectionNode(head1, head2).val);
		System.out.println(new LinkedListIntersection().getIntesectionNod(head1, head2).val);
		
	}
	

}
