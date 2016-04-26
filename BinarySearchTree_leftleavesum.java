package dataStructures;

public class BinarySearchTree_leftleavesum {

	public static int leftLeavesSum = 0;

	public static void leftSum(TreeNode root, TreeNode parent) {
		if (root != null) {
			leftSum(root.leftTree, root);
			if (root.leftTree == null && root.rightTree == null && parent.leftTree == root) {
				leftLeavesSum += root.val;
			}
			leftSum(root.rightTree, root);
		}
	}

}
