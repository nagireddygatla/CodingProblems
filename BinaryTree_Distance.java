package dataStructures;

public class BinaryTree_Distance {
	
	public int findDistance(TreeNode root, int n1, int n2) {
		int x = Pathlength(root, n1) - 1;
		int y = Pathlength(root, n2) - 1;
		int lcaData = findLCA(root, n1, n2).val;
		int lcaDistance = Pathlength(root, lcaData) - 1;
		return (x + y) - 2 * lcaDistance;
	}

	public int Pathlength(TreeNode root, int n1) {
		if (root != null) {
			int x = 0;
			if ((root.val == n1) || (x = Pathlength(root.leftTree, n1)) > 0
					|| (x = Pathlength(root.rightTree, n1)) > 0) {
				// System.out.println(root.data);
				return x + 1;
			}
			return 0;
		}
		return 0;
	}

	

	private TreeNode findLCA(TreeNode root,int one, int two) {
	
		if(root==null)return null;
		
		if(one==root.val || two==root.val)return root;
			
		TreeNode left = findLCA(root.leftTree,one,two);
		TreeNode right = findLCA(root.rightTree,one,two);
		
		if(left!=null && right!=null)return root;
		
		if(left==null)return right;
		else return left;
	}
	
	
}
