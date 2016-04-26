package dataStructures;

public class BinaryTreeReconstruct_InorderPreorder {
	static int preCounter = 0;

	private TreeNode constructUtility(int[] pre, int[] ino, int start, int end) {
		if(start>end)return null;
		System.out.println(start + "  "+ end);
		TreeNode tNode = new TreeNode(pre[preCounter]);
		preCounter++;
		//System.out.println(preCounter);
		if(start==end)return tNode;
		int index = searchVal(ino,start,end,tNode.val);
		tNode.leftTree = constructUtility(pre, ino, start, index-1);
		tNode.rightTree = constructUtility(pre, ino, index+1, end);
		return tNode;
	}

	private int searchVal(int[] ino, int start, int end, int val) {
		int i;
		for(i=start;i<=end;i++){
			if(ino[i]==val)
				return i;
		}
		return i;
	}
	
	 void printInorder(TreeNode node) {
		 	if (node == null) {
	            return;
	        }
	        printInorder(node.leftTree);
	        System.out.print(node.val + " ");
	        printInorder(node.rightTree);
	    }
	 
	    // driver program to test above functions
	    public static void main(String args[]) {
	    	BinaryTreeReconstruct_InorderPreorder tree = new BinaryTreeReconstruct_InorderPreorder();
	        int pre[] = new int[]{9, 7, 5, 8, 12, 11, 13};
	        int in[] = new int[]{5, 7, 8, 9, 11, 12, 13};
	        int len = in.length;
	        TreeNode mynode = tree.constructUtility(in, pre, 0, len - 1);
	 
	        // building the tree by printing inorder traversal
	        System.out.println("Inorder traversal of constructed tree is : ");
	        tree.printInorder(mynode);
	    }
}
