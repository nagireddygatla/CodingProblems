package dataStructures;
import java.util.*;
	
public class BinarySearchBFS_LevelOrderTraversal {

	public static void printBST(TreeNode roots){
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(roots);
		
		
			while(!queue.isEmpty()){
			
			TreeNode root = queue.poll();
			
			System.out.println(root.val);
			
			if(root.leftTree != null){
				queue.add(root.leftTree);
			}
			if(root.rightTree!=null){
				queue.add(root.rightTree);
			}	
		}
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
		printBST(roots);	
	}
}
