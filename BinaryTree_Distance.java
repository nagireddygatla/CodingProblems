package dataStructures;

public class BinaryTree_Distance {
	
	public int distance(TreeNode root,TreeNode one, TreeNode two){
		
		TreeNode lcaNode = LCA(root,one,two);
		
		
		
		return 0;
	}

	private TreeNode LCA(TreeNode root,TreeNode one, TreeNode two) {
	
		if(root==null)return null;
		
		if(one.val==root.val || two.val==root.val)return root;
			
		TreeNode left = LCA(root.leftTree,one,two);
		TreeNode right = LCA(root.rightTree,one,two);
		
		if(left!=null && right!=null)return root;
		
		if(left==null)return right;
		else return left;
	}
	
	
}
