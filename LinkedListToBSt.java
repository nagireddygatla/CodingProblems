package dataStructures;

public class LinkedListToBSt {

public TreeNode sortedListToBST(ListNode head) {
        
        if(head==null)return null;
        return listToBST(head,null);
        
    }
    
    public TreeNode listToBST(ListNode head,ListNode tail){
        
        ListNode fast = head;
        ListNode slow = head;
        
        if(head==tail)return null;
        
        while(fast != tail && fast.next != tail){
           fast = fast.next.next;
           slow = slow.next;
        }
        
        TreeNode thead = new TreeNode(slow.val);
        thead.leftTree = listToBST(head,slow);
        thead.rightTree = listToBST(slow.next,tail);
        
        return thead;
    }

}
