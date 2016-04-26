package dataStructures;

public class LinkedList_MergeKLists {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */

	    public ListNode mergeKLists(ListNode[] lists) {
	        if(lists.length==0)return null;
	        if(lists.length==1)return lists[0];
	        
	        int len = lists.length;
	        int first = len/2;
	        int second = len - first;
	        ListNode [] firstList = new ListNode[first];
	        ListNode [] secondList = new ListNode[second];
	        
	        System.arraycopy(lists,0,firstList,0,first);
	        System.arraycopy(lists,first,secondList,0,second);
	        
	        ListNode firstNode = mergeKLists(firstList);
	        ListNode secondNode = mergeKLists(secondList);
	        
	        //handling null case
	        ListNode head = null;
	        if(firstNode==null){
	            
	            head = secondNode;
	            return head;
	        }
	        if(secondNode==null){
	            
	            head = firstNode;
	            return head;
	        }
	        
	        //finding the head
	        if(firstNode.val < secondNode.val){
	            head = firstNode;
	            firstNode = firstNode.next;
	        }
	        else{
	            head = secondNode;
	            secondNode = secondNode.next;
	        }
	        
	        ListNode p = head;
	        while(firstNode != null && secondNode != null){
	           if(firstNode.val < secondNode.val){
	            p.next = firstNode;
	            firstNode = firstNode.next;
	            p = p.next;
	        }
	        else{
	            p.next = secondNode;
	            secondNode = secondNode.next;
	            p = p.next;
	        } 
	        }
	        
	        if(firstNode==null)p.next = secondNode;
	        else p.next = firstNode;
	     
	     return head;
	    }
	

}
