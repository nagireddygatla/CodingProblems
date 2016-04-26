package dataStructures;

import java.util.Map.Entry;
import java.util.*;

//Prove that two trees are identical both in structure and values
public class BinaryTreeEqual {	
	TreeNode root;

public TreeNode insertNodes(int val){	
	StringBuilder res = new StringBuilder();
		
		TreeNode newnode = new TreeNode(val);
		//System.out.println(root);

		if(root==null){
			
			root = newnode;
			return root;
		}
		else{
			
			TreeNode focusNode = root;
			TreeNode parent;
			
		while(true){
			parent = focusNode;
			//System.out.println(focusNode.val);
		if(focusNode.val>val){
			focusNode = focusNode.leftTree;
			if(focusNode==null){
				parent.leftTree = newnode;
				return root;
			}
			
		}
		else{
			focusNode = focusNode.rightTree;
			if(focusNode==null){
				parent.rightTree = newnode;
				return root;
			}
			
		}
		}
		}
}
	
	
	public boolean isSameTree(TreeNode p, TreeNode q){
	
		if(p==null && q == null)return true;
		
		if((p==null && q != null) || (p!=null && q==null))return false;
		
		if(p.val != q.val)return false;
		
		 return isSameTree(p.leftTree,q.leftTree) && isSameTree(p.rightTree, q.rightTree);
		
	}

	public static void main(String [] args){
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		
		BinaryTreeEqual obj = new BinaryTreeEqual();
		TreeNode root1=null;
		for(String s:input.split("\\s")){
			
			 root1 = obj.insertNodes(Integer.parseInt(s));;
			
		}
		
		Scanner in1 = new Scanner(System.in);
		String input1 = in1.nextLine();
		TreeNode root2=null;
		BinaryTreeEqual obj1 = new BinaryTreeEqual();
		for(String s:input1.split("\\s")){
			
			 root2 = obj1.insertNodes(Integer.parseInt(s));
			
		}
		
		BinaryTreeEqual obj3 = new BinaryTreeEqual();
		System.out.println(obj3.isSameTree(root1, root2));
	    
		
		
		
	}
	
	
}

