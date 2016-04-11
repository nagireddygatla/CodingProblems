package dataStructures;

public class LowestCommonAncestor {

	public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){
		
		if(root==null) return null;
		
		if(root==p || root == q)return root;
		
		TreeNode left = LCA(root.leftTree,p,q);
		TreeNode right = LCA(root.rightTree,p,q);
		
		if(left !=null && right != null)return root;
		
		if(left == null)return right;
		else return left;
	}

}
