package dataStructures;

public class BinarySearchTree_SubTree {

	
	public boolean isSameTree(TreeNode t1, TreeNode t2){
		
		if(t2==null)return true;
		
		return matchNodes(t1,t2);
		
		
	}

	private boolean matchNodes(TreeNode t1, TreeNode t2) {
		
		if(t1==null)return false;
		
		if(t1.val == t2.val){
			
			return treeMatch(t1,t2);
		}
		
	
		return matchNodes(t1.leftTree,t2) || matchNodes(t1.rightTree,t2);
	}

	private boolean treeMatch(TreeNode t1, TreeNode t2) {
		
		if(t1==null && t2==null)return true;
		if(t1==null || t2==null)return false;
		
		if(t1.val != t2.val)return false;
		return treeMatch(t1.leftTree,t2.leftTree) && treeMatch(t1.rightTree,t2.rightTree);
	}

}
