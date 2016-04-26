package dataStructures;

public class BinarySearchTree_Symmetric {

	 public boolean isSymmetric(TreeNode root) {
	        if(root==null)return true;
	        return symmetricUtil(root,root);
	    }
	    
	    public boolean symmetricUtil(TreeNode rootL,TreeNode rootR){
	        
	        if(rootL==null && rootR==null)return true;
	        
	        if((rootL==null && rootR!=null) || (rootL!=null && rootR==null)) return false;
	        
	        if((rootL.val!=rootR.val))return false;
	        
	        return symmetricUtil(rootL.leftTree,rootR.rightTree) && symmetricUtil(rootL.rightTree,rootR.leftTree);
   
	    }
}
