package dataStructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree_PostOrderIterative {

	public List<Integer> postOrder(TreeNode root){
		List<Integer> list = new LinkedList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if(root==null)return list;
		
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode node=stack.pop();
			list.add(0,node.val);
			if(node.leftTree!=null)stack.push(node.leftTree);
			if(node.rightTree!=null)stack.push(node.rightTree);
		}
		return list;
	}
	
}
