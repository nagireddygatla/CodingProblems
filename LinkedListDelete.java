package dataStructures;

class ListNode{

	int val;
	ListNode next;

	public ListNode(int x){
		this.val = x;
	}
}

public class LinkedListDelete {
	
	ListNode head;

	public LinkedListDelete(ListNode obj) {
		this.head = obj;
	}

public void deleteNode(ListNode node) {
	node.val = node.next.val;
	node.next = node.next.next;
    }


	public static void main(String []args){
		
		ListNode obj1 = new ListNode(1);
		ListNode obj2 = new ListNode(2);
		ListNode obj3 = new ListNode(3);
		ListNode obj4 = new ListNode(4);
		obj1.next  = obj2;
		obj2.next = obj3;
		obj3.next = obj4;
		obj4.next = null;
		LinkedListDelete newobj =new LinkedListDelete(obj1);
		newobj.deleteNode(obj3);
		while(obj1 != null){
			System.out.println(obj1.val);
			obj1 = obj1.next;
		}
		
	}
	
}
