package dataStructures;

public class BinaryTree_Diameter {
	
	public static int diameter(TreeNode root){
		if(root==null)return 0;
	
		int submax = Math.max(diameterUtil(root.leftTree), diameterUtil(root.rightTree));
		submax = Math.max(submax, diameterUtil(root.leftTree)+diameterUtil(root.rightTree));
		
		return submax;
	}

	private static int diameterUtil(TreeNode root) {
	
		if(root==null)return 0;
		return 1+Math.max(diameterUtil(root.leftTree),diameterUtil(root.rightTree));
	}
	
	public static void main(String [] args){
		
		TreeNode roots = new TreeNode(9);
		TreeNode roots1 = new TreeNode(7);
		TreeNode roots2 = new TreeNode(16);
		TreeNode roots3 = new TreeNode(5);
		TreeNode roots4 = new TreeNode(8);
		TreeNode roots5 = new TreeNode(11);
		TreeNode roots6 = new TreeNode(18);
		TreeNode root7 = new TreeNode(19);
		TreeNode root8 = new TreeNode(20);
		roots.leftTree = roots1;
		roots.rightTree = roots2;
		roots1.leftTree = roots3;
		roots1.rightTree = roots4;
		roots2.leftTree = roots5;
		roots2.rightTree = roots6;
		roots6.leftTree = null;
		roots6.rightTree = root7;
		root7.leftTree = null;
		root7.rightTree = root8;
		System.out.println(diameter(roots));
		//diameter(roots);
	}

}
