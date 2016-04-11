package dataStructures;

public class BinarySearchTree_KthSmallestElement {

	int result = -1;
	int n = 0;
	
	public int kthSmallest(TreeNode root, int k){
		
		DFS(root,k);
		
		return result;
	}

	private void DFS(TreeNode root, int k) {
		
		if(root==null || n>=k)return;		
		DFS(root.leftTree,k);
		n++;
		if(n==k)result = root.val;
		DFS(root.rightTree,k);

	}

}
