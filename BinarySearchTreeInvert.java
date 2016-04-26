package dataStructures;

import java.util.LinkedList;

public class BinarySearchTreeInvert {

	 public TreeNode invertTree(TreeNode root) {
	     if(root==null)return root;
	     
	     TreeNode temp = root.leftTree;
	     root.leftTree = invertTree(root.rightTree);
	     root.rightTree = invertTree(temp);
	     return root;
	    }
	 ///Iterative way of invertin tree
	 public TreeNode invertTreeIterative(TreeNode root) {
		    LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		 
		    if(root!=null){
		        queue.add(root);
		    }
		 
		    while(!queue.isEmpty()){
		        TreeNode p = queue.poll();
		        if(p.leftTree!=null)
		            queue.add(p.leftTree);
		        if(p.rightTree!=null)
		            queue.add(p.rightTree);
		 
		        TreeNode temp = p.leftTree;
		        p.leftTree = p.rightTree;
		        p.rightTree = temp;
		    }
		 
		    return root;    
		}

}
