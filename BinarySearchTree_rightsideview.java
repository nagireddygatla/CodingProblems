package dataStructures;

import java.util.*;

public class BinarySearchTree_rightsideview {
	
	    public List<Integer> rightSideView(TreeNode root) {
	        List<Integer> result = new ArrayList<Integer>();
	        Queue<TreeNode> queues = new LinkedList<TreeNode>();
	        
	        if(root==null)return result;
	        
	        queues.add(root);
	        
	        while(!queues.isEmpty()){
	            int siz=queues.size();
	            for(int i=0;i<siz;i++){
	            TreeNode nodes = queues.remove();
	            //replace siz-1 with 0, you get left side view of the binary tree
	            if(i==siz-1)result.add(nodes.val);
	            if(nodes.leftTree!=null)queues.add(nodes.leftTree);
	            if(nodes.rightTree!=null)queues.add(nodes.rightTree);
	            }   
	        }
	        return result;
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
			BinarySearchTree_rightsideview obj = new BinarySearchTree_rightsideview();
			System.out.println(obj.rightSideView(roots));
			
	    	
	    }

}
