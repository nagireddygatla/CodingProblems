package dataStructures;
import java.util.*;


public class BinarrySearchTree_Inorder_Iterative {

	public static List<Integer> inorderTraversal(TreeNode root){
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(root!=null){
			stack.push(root);
			root = root.leftTree;
			while(root==null){	
				if(stack.empty())return list;
				root = stack.pop();
				list.add(root.val);
				root = root.rightTree;
			}
		}
		return list;
	}
	
	public static List<Integer> preorderTraversal(TreeNode root){
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(root!=null){
			list.add(root.val);
			stack.push(root);
			root = root.leftTree;
			while(root==null){
				if(stack.empty())return list;
				root = stack.pop();
				root = root.rightTree;
			}
		}
		return list;
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
		//System.out.println(inorderTraversal(roots));
		System.out.println(preorderTraversal(roots));
	}
}