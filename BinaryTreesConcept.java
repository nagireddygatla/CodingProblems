package dataStructures;

public class BinaryTreesConcept {
	Tree root;
	
	public BinaryTreesConcept(Tree root){
		
		this.root = root;
		
	}
	
	public Tree insertNodes(int val){
		
		Tree newnode = new Tree(val);
		//System.out.println(root);
		
		if(root==null){
			
			root = newnode;
			return root;
		}
		else{
			
			Tree focusNode = root;
			Tree parent;
			
		while(true){
			parent = focusNode;
			//System.out.println(focusNode.val);
		if(focusNode.val>val){
			focusNode = focusNode.leftTree;
			if(focusNode==null){
				parent.leftTree = newnode;
				return root;
			}
			
		}
		else{
			focusNode = focusNode.rightTree;
			if(focusNode==null){
				parent.rightTree = newnode;
				return root;
			}
			
		}
		}
		}
		
		
		//return root;
		
	}
	
	public void treeInorderTraversal(Tree focusNode){
		if(focusNode!=null){
			
		treeInorderTraversal(focusNode.leftTree);
		System.out.print(focusNode.val+","+" ");
		treeInorderTraversal(focusNode.rightTree);
		}
		
		
	}
	
	public void treePreorderTraversal(Tree focusNode){
		if(focusNode!=null){
			System.out.print(focusNode.val+","+" ");
		treePreorderTraversal(focusNode.leftTree);
		treePreorderTraversal(focusNode.rightTree);
		}
		
	}
	
	public void treePostorderTraversal(Tree focusNode){
		if(focusNode!=null){
			
			treePostorderTraversal(focusNode.leftTree);
			treePostorderTraversal(focusNode.rightTree);
			System.out.println(focusNode.val);
		}
		
	}
	
	public Tree findNode(int val){
		Tree focusNode = root;
		
		
		while(focusNode.val!=val){
			
			if(focusNode.val<=val){
				
				focusNode = focusNode.rightTree;
				
			}else{
				focusNode = focusNode.leftTree;
			}
			
			//if(focusNode==null)return null;
		}
		//System.out.println(focusNode.val);
		return focusNode;
	}
	
	
	
	public static void main(String [] args){
		Tree roots = new Tree(9);
		Tree roots1 = new Tree(7);
		Tree roots2 = new Tree(12);
		Tree roots3 = new Tree(5);
		Tree roots4 = new Tree(8);
		Tree roots5 = new Tree(11);
		Tree roots6 = new Tree(13);
		roots.leftTree = roots1;
		roots.rightTree = roots2;
		roots1.leftTree = roots3;
		roots1.rightTree = roots4;
		roots2.leftTree = roots5;
		roots2.rightTree = roots6;
		roots6.leftTree = null;
		roots6.rightTree = null;
		BinaryTreesConcept obj = new BinaryTreesConcept(roots);
		Tree res = obj.insertNodes(15);
		obj.treeInorderTraversal(roots);
		System.out.println();
		obj.treePreorderTraversal(roots);
		//obj.treePostorderTraversal(roots);
		System.out.println(res.val);

		System.out.println(obj.findNode(13).val);
		
	}
	

}

class Tree{
	int val;
	Tree leftTree;
	Tree rightTree;
	
	Tree(int x){
		
		this.val = x;
	}
	
	
	
}
