package dataStructures;

class Nodelist{
	int val;
	Nodelist next;	
	public Nodelist(int val){
		this.val = val;
	}	
}

public class OddEvenLinkedList {
	
		public Nodelist oddEvenList(Nodelist head) {
			
			if(head == null || head.next == null) return head;
			Nodelist oddlist = head;
			Nodelist result = oddlist;
			Nodelist evenlist = head.next;
			Nodelist evenset = evenlist;
			head = head.next.next;
			int i = 1;
			
			while(head != null){
				if(i%2 == 0){
				evenlist.next = head;
				evenlist = evenlist.next;
				}
				else{
					oddlist.next = head;
					oddlist = oddlist.next;
				}
				head = head.next;
				i=i+1;
			}
			evenlist.next = null;
			oddlist.next = evenset;
			return result;			
		}
	
	
	
	public static void main(String [] args){
		
		Nodelist obj1 = new Nodelist(1);
		Nodelist obj2 = new Nodelist(2);
		Nodelist obj3 = new Nodelist(3);
		Nodelist obj4 = new Nodelist(4);
		Nodelist obj5 = new Nodelist(5);
		Nodelist obj6 = new Nodelist(6);
		Nodelist obj7 = new Nodelist(7);
		Nodelist obj8 = new Nodelist(8);
		Nodelist obj9 = new Nodelist(9);
		obj1.next = obj2;
		obj2.next = obj3;
		obj3.next = obj4;
		obj4.next = obj5;
		obj5.next = obj6;
		obj6.next = obj7;
		obj7.next = obj8;
		obj8.next = obj9;
		obj9.next = null;
		
		OddEvenLinkedList OLE = new OddEvenLinkedList();
		Nodelist obj =OLE.oddEvenList(obj1);
		while(obj != null){
			//System.out.println(obj.val);
			obj = obj.next;
		}
	}
}