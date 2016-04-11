package dataStructures;

import java.util.StringTokenizer;

public class BinarySearchTree_SerializeDeserialize {

	public String Serialize(TreeNode root){
		
		if(root==null)return null;
		StringBuilder sb = new StringBuilder();
		String result = serailzeHelper(root,sb);
		System.out.println(result);
		return result;
		
	}

	public String serailzeHelper(TreeNode root, StringBuilder sb) {
		if(root==null){
			sb.append("#"+" ");
		}
		
		else{
			
		sb.append(root.val + " ");
		serailzeHelper(root.leftTree,sb);
		serailzeHelper(root.rightTree,sb);
		}
		return sb.toString();
	}
	
	public TreeNode deSerialize(String input){
		StringTokenizer st = new StringTokenizer(input," ");
		TreeNode res = deserializeHelper(st);
		return res;
	}

	public TreeNode deserializeHelper(StringTokenizer st) {
		if(!st.hasMoreElements())return null;
		String node = (String) st.nextElement();
		if(node.equals("#"))return null;
		TreeNode root = new TreeNode(Integer.valueOf(node));
		root.leftTree = deserializeHelper(st);
		root.rightTree = deserializeHelper(st);
		return root;
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
			BinarySearchTree_SerializeDeserialize obj = new BinarySearchTree_SerializeDeserialize();
		obj.Serialize(roots);
	    }
	
}
