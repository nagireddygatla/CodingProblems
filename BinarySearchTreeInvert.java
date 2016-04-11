package dataStructures;

public class BinarySearchTreeInvert {

	 public TreeNode invertTree(TreeNode root) {
	     if(root==null)return root;
	     
	     TreeNode temp = root.leftTree;
	     root.leftTree = invertTree(root.rightTree);
	     root.rightTree = invertTree(temp);
	     return root;
	    }

}
