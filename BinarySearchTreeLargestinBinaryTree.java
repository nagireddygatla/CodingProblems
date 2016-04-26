package dataStructures;

public class BinarySearchTreeLargestinBinaryTree {

	public int largestBST(TreeNode root){
		if(root==null)return 0;
		MinMax res = largest(root);
		return res.size;
	}

	private MinMax largest(TreeNode root) {
		if(root==null)return new MinMax();
		
		MinMax leftMinMax = largest(root.leftTree);
		MinMax rightMinMax = largest(root.rightTree);
		MinMax m = new MinMax();
		if(leftMinMax.isBST==false || rightMinMax.isBST==false || leftMinMax.max>root.val || rightMinMax.min<=root.val){
			m.isBST = false;
			m.size = Math.max(leftMinMax.size,rightMinMax.size);
			return m;
		}
		
		m.isBST = true;
		m.size = leftMinMax.size+rightMinMax.size+1;
		m.min = root.leftTree!=null?leftMinMax.min:root.val;
		m.max = root.rightTree!=null?rightMinMax.max:root.val;
		
		return m;
	}

}

class MinMax{
	
	int size;
	int min;
	int max;
	boolean isBST;
	public MinMax(){
		size = 0;
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		isBST = true;
	}
	
}