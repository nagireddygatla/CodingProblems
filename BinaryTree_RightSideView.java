package dataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTree_RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> queues = new LinkedList<TreeNode>();
        
        if(root==null)return result;
        
        //if(root!=null){
        queues.add(root);
        //}
        
        while(!queues.isEmpty()){
            int siz=queues.size();
            for(int i=0;i<siz;i++){
            TreeNode nodes = queues.remove();
            if(i==siz-1)result.add(nodes.val);
            if(nodes.leftTree!=null)queues.add(nodes.leftTree);
            if(nodes.rightTree!=null)queues.add(nodes.rightTree);
            }
            
        }
        
        return result;
    }
}
