package dataStructures;

import java.util.Arrays;

public class BinaryTreeBalanced_Opt {

	
	public boolean IsBalanced_Opt(TreeNode root){
		
		
		
		if(root==null)return false;
		
		if(getHeight(root) == -1){
			return false;
		}
		else{
			
			return true;
		}
		
	}
	
	
	private int getHeight(TreeNode root) {
		
		if(root==null)return 0;
	
		int leftHeight = getHeight(root.leftTree);
		if(leftHeight==-1)return -1;
		
		int rightHeight = getHeight(root.rightTree);
		if(rightHeight==-1)return -1;
		
		int diff = leftHeight - rightHeight;
		
		if(diff>1 || diff<-1 ){
			
			return -1;
		}else{
			
			return Math.max(leftHeight,rightHeight)+1;
		}
	}


	public static void main(String [] args){
		
		long now = System.nanoTime();
		
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
		roots6.rightTree = null;
		root7.leftTree = null;
		root7.rightTree = root8;
		BinaryTreeBalanced_Opt obj = new BinaryTreeBalanced_Opt();
		System.out.println(obj.IsBalanced_Opt(roots));
		System.out.println(System.nanoTime()-now);
		
	}

}
