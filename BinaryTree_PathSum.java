package dataStructures;

/*Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1*/
public class BinaryTree_PathSum {

	public boolean hasPathSum(TreeNode root, int sum){
		if(root==null) return false;
		
		if(root.val==sum && root.leftTree == null && root.rightTree == null){
			return true;
		}
		else
		{
			return hasPathSum(root.leftTree,sum-root.val) || hasPathSum(root.rightTree,sum-root.val);
		}
		
		
	}

	public static void main(String [] args){
		
		TreeNode roots = new TreeNode(5);
		TreeNode root1 = new TreeNode(4);
		TreeNode root2 = new TreeNode(8);
		TreeNode root3 = new TreeNode(11);
		TreeNode root4 = new TreeNode(13);
		TreeNode root5 = new TreeNode(4);
		TreeNode root6 = new TreeNode(7);
		TreeNode root7 = new TreeNode(2);
		TreeNode root8 = new TreeNode(1);
		roots.leftTree = root1;
		roots.rightTree = root2;
		root1.leftTree = root3;
		root1.rightTree = null;
		root2.leftTree = root4;
		root2.rightTree = root5;
		root3.leftTree = root6;
		root3.rightTree=root7;
		root5.rightTree = root8;
		int finSum = 22;
		BinaryTree_PathSum obj = new BinaryTree_PathSum();
		System.out.println(obj.hasPathSum(roots,finSum));
		
		
	}

}
