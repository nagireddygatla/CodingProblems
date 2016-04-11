package dataStructures;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 public class BinarySearchTree_Array {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)return null;
       return sortedBST(nums,0,nums.length-1);
        
    }
    
    public TreeNode sortedBST(int [] nums, int start, int end){
        
        if(start>end)return null;
        
        int mid = (start + end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        
        root.leftTree = sortedBST(nums,start,mid-1);
        root.rightTree = sortedBST(nums,mid+1,end);
        
        
        return root;
        
    }
}
