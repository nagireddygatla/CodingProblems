package dataStructures;

public class RevLinkedList_Recursion {

	
	
	public static RecurseNode reverseLinkedList(RecurseNode node) {
	     if (node == null || node.next == null) {
	         return node;
	     }

	     RecurseNode remaining = reverseLinkedList(node.next);
	     node.next.next = node;
	     node.next = null;
	     return remaining;
	 }
	
	
	public static void main(String [] args){
		RecurseNode obj1 = new RecurseNode(2);
		RecurseNode obj2 = new RecurseNode(3);
		RecurseNode obj3 = new RecurseNode(4);
		obj1.next  = obj2;
		obj2.next = obj3;
		obj3.next = null;

		
		RecurseNode temp = reverseLinkedList(obj1);
		
		while(temp!=null){
			
			System.out.println(temp.val);
			temp = temp.next;
			
		}
		
		
	}
	

}

class RecurseNode{
	int val;
	RecurseNode next;
	public RecurseNode(int val){
		
		this.val = val;
	}
}
