package dataStructures;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static List<String> binaryTreePaths(TreeNode root) {
     
     List<String> list = new ArrayList<String>();
     //if(root==null)return list;
     StringBuilder sb = new StringBuilder();
         treePathsUtil(root,sb,list);
         return list;
    }
    
    public static void treePathsUtil(TreeNode root,StringBuilder sb, List<String> list) {
        
        if(root==null)return;
        int len = sb.length();
        sb.append(root.val);
     if(root.leftTree==null && root.rightTree==null){
     list.add(sb.toString());
     }
     else{
         sb.append("->");
     treePathsUtil(root.leftTree,sb,list);
     treePathsUtil(root.rightTree,sb,list);
     }
     
     sb.setLength(len);
      
    }
    
    
    public static void main(String [] args){
    	
    	TreeNode roots = new TreeNode(9);
    	TreeNode roots1 = new TreeNode(7);
		TreeNode roots2 = new TreeNode(12);
		TreeNode roots3 = new TreeNode(5);
		TreeNode roots4 = new TreeNode(8);
		TreeNode roots5 = new TreeNode(11);
		TreeNode roots6 = new TreeNode(13);
		roots.leftTree = roots1;
		roots.rightTree = roots2;
		roots1.leftTree = roots3;
		roots1.rightTree = roots4;
		roots2.leftTree = roots5;
		roots2.rightTree = roots6;
		roots6.leftTree = null;
		roots6.rightTree = null;
		binaryTreePaths(roots);
		
    }
    
}
