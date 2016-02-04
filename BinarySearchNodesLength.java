package dataStructures;

public class BinarySearchNodesLength {
	static int [] store=new int [25];

	public static void checkBST(TreeNode vertex,TreeNode parent){

		if(parent.val==-1)
			{
			store[vertex.val]=0;
			}
		else{
			
			store[vertex.val] = 1 + store[parent.val];
		}
		if(vertex.leftTree!=null)checkBST(vertex.leftTree,vertex);
		if(vertex.rightTree!=null)checkBST(vertex.rightTree,vertex);
	}
	
	public static int[] hitBST(TreeNode root){
		TreeNode temp = new TreeNode(-1);
		checkBST(root,temp);
		return store;
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
		int [] store = hitBST(roots);

		for(int i=0;i<store.length;i++){
			if(store[i]!=0){
			System.out.println("The length of the node "+i+" from the root is "+store[i]);
			}
		}
	}
}