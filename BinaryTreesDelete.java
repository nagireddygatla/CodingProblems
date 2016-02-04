package dataStructures;



public class BinaryTreesDelete {
	
	TreeNode root;
	public BinaryTreesDelete(TreeNode root){
		
		this.root=root;
		
	}
	
	public boolean remove(int val){
		
		TreeNode focusNode = root;
		TreeNode parent = root;
		boolean isItLeftChild = true;
		
		while(focusNode.val != val){
			
			parent = focusNode;
			
			if(focusNode.val > val){
				isItLeftChild = true;
				focusNode = focusNode.leftTree;
			}
			else{
				isItLeftChild = false;
				focusNode = focusNode.rightTree;
			}	
			
			if(focusNode == null) return false;
			
		}
		
		
		if(focusNode.leftTree == null && focusNode.rightTree == null){
			
			if(focusNode==root){
				root = null;
			}
			else if(isItLeftChild){
				
				parent.leftTree = null;
			}else{
				
				parent.rightTree = null;
			}
		}
		else if(focusNode.leftTree == null){
			
			if(focusNode == root){
				
				root = focusNode.rightTree;
			}
			else if(isItLeftChild){
				
				parent.leftTree = focusNode.rightTree;
				
			}
			else{
				
				parent.rightTree = focusNode.rightTree;
			}
		}
		else if(focusNode.rightTree == null){
			
			if(focusNode == root){
				
				root = focusNode.leftTree;
			}
			else if(isItLeftChild){
				
				parent.leftTree = focusNode.leftTree;
				
			}
			else{
				
				parent.rightTree = focusNode.leftTree;
			}
			
			
		}
		
		else
		{
		TreeNode replacement = replacementNode(focusNode);
		if(isItLeftChild){
			
			parent.leftTree = replacement;
		}else{
			parent.rightTree = replacement;
		}
			
		replacement.leftTree = focusNode.leftTree;
		
		}
		
		
		return true;
	}
	
	public TreeNode replacementNode(TreeNode toBeReplacedNode){
		TreeNode replacement = toBeReplacedNode;
		TreeNode focusNode = toBeReplacedNode.rightTree;
		TreeNode replacementParent = null;
		while(focusNode!=null){
			replacementParent = replacement;
			replacement = focusNode;
			focusNode = focusNode.leftTree;
		}
		
		if(replacement != toBeReplacedNode.rightTree){
			
			replacementParent.leftTree = replacement.rightTree;
			replacement.rightTree = toBeReplacedNode.rightTree;
		}
		
		return replacement;
	}
	
	public void treePostorderTraversal(TreeNode focusNode){
		if(focusNode!=null){
			
			treePostorderTraversal(focusNode.leftTree);
			System.out.println(focusNode.val);
			treePostorderTraversal(focusNode.rightTree);
			
		}
		
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
		BinaryTreesDelete obj = new BinaryTreesDelete(roots);
		System.out.println(obj.remove(12));
		obj.treePostorderTraversal(roots);
		
	}
	

}
class TreeNode{
	
	int val;
	TreeNode leftTree;
	TreeNode rightTree;
	
	public TreeNode(int val){
		
		this.val = val;
		
	}
	
}