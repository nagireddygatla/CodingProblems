package dataStructures;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class LinkedList_MergeSort {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                node.next = l1;
                l1 = l1.next;
            }
            else{
                node.next = l2;
                l2 = l2.next;
                
            }
            node.next.next=null;
            node = node.next;
            
            
        }
        
        if(l1!=null){
            node.next = l1;
        }else{
            node.next = l2;
        }
        
        return dummy.next;
    }
}
