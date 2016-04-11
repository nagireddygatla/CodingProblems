package dataStructures;
import java.util.*;

public class BinarySearchTree_LinkedListLevel {


	public ArrayList<LinkedList<TreeNode>> createLinkedList(TreeNode root){
		
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		
		if(root!=null){
		current.add(root);
		}
		
		if(current.size()>0){
			result.add(current);
			LinkedList<TreeNode> parents = current;
			current = new LinkedList<TreeNode>();
			for(TreeNode parent:parents){
				if(parent.leftTree!=null){
					current.add(parent.leftTree);
				}
				
				if(parent.rightTree!=null){	
					current.add(parent.rightTree);
				}	
			}	
		}	
		return result;
	}
}
