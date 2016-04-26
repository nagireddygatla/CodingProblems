package dataStructures;
/*Given a binary tree, flatten it to a linked list in-place.
For example,
Given
         1
        / \
       2   5
      / \   \
     3   4   6
The flattened tree should look like:
  1
   \
    2
     \
      3
       \
        4
         \
          5
           \
            6*/
public class BinaryTree_Flatten {
	
	TreeNode tail;
	
	public TreeNode flatten(TreeNode root){
		
		if(root==null) return null;
		
		tail = root;
		//System.out.println(tail.val);
		flatten(root.leftTree);
		//System.out.println(root.val);
		tail.rightTree = root.rightTree;
		flatten(root.rightTree);
		if(root.leftTree != null){
			root.rightTree = root.leftTree;
			root.leftTree = null;
		}
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
		TreeNode obj = (new BinaryTree_Flatten()).flatten(roots);
		
		while(obj!=null){
			System.out.println(obj.val);
			obj = obj.rightTree;
			
		}
		
	}

}
