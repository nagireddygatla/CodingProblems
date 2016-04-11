package dataStructures;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class LinkedList_Rotate {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        ListNode current = head;
        int size= 1;
        while(current.next != null){
            current = current.next;
            size = size+1;
        }
        k=k%size;
        current.next = head;
        for(int i = 0; i<size-k;i++){
            current = current.next;
        }
        head = current.next;
        current.next = null;
        return head;
        
    }
}