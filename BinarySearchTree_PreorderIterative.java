package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinarySearchTree_PreorderIterative {
	public List<Integer> preorderTraversal(TreeNode root) {
	    List<Integer> result=new ArrayList<>();
	    if(root==null) return result;
	    Stack<TreeNode> stack=new Stack<>();
	    stack.push(root);
	    while(!stack.isEmpty()){
	        TreeNode node=stack.pop();
	        if(node.rightTree!=null) stack.push(node.rightTree);
	        if(node.leftTree!=null) stack.push(node.leftTree);
	        result.add(node.val);
	    }
	    return result;
	}
}