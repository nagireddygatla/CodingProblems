package dataStructures;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class LinkedList_ReverseGroups {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head==null || head.next==null) return head;
        if(!isValidRev(head,k))return head;
        
        ListNode curr = head;
        ListNode prev = null,nexus=null;
        ListNode temp = curr;
        int count = k;
        while(count>0){
            
            nexus = curr.next;
            curr.next = prev;
            prev = curr;
            curr=nexus;
            count--;
        }
        
        temp.next = reverseKGroup(curr,k);
        return prev;
        
    }
    
    public boolean isValidRev(ListNode node,int k){
        
        if(node==null)return false;
        ListNode temp = node;
        int count = k;
        while(count>0 && temp!=null){
            temp = temp.next;
            count--;
        }
        
        if(count>0)return false;
        return true;
    }
}