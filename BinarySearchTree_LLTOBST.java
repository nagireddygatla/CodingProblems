package dataStructures;



public class BinarySearchTree_LLTOBST {

	public TreeNode LinkedListToBST(ListNode root){
		
		if(root==null)return null;
		
		return LLTOBST(root,null);
	}

	private TreeNode LLTOBST(ListNode head, ListNode tail) {
		
		if(head==tail)return null;
		
		ListNode fast = head;
		ListNode slow = head;
		
		while(fast!=tail && fast.next!=tail){
			slow = slow.next;
			fast = fast.next.next;
			
		}
		
		TreeNode thead = new TreeNode(slow.val);
		thead.leftTree = LLTOBST(head,slow);
		thead.rightTree = LLTOBST(slow.next,tail);
		
		
		return thead;
	}
	
	

}
