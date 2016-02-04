package dataStructures;


 class Lists {
     int val;
     Lists next;
     Lists(int x) { val = x; }
 }
public class LinkedList_SwapPairs {

	public LinkedList_SwapPairs() {
		// TODO Auto-generated constructor stub
	}
	
public Lists swapPairs(Lists head) {
	if(head == null) return null;
	if(head.next ==null)return head;
	
	Lists temp = head;
	int temps;
	while(temp.next != null){
		temps = temp.val;
		temp.val = temp.next.val;
		temp.next.val = temps;
		temp = temp.next.next;
		if(temp==null)break;
		
	}
	
	
	
    return head;    
    }
	
	
	public static void main(String [] args){
		
		
		Lists obj1 = new Lists(1);
		Lists obj2 = new Lists(2);
		Lists obj3 = new Lists(3);
		Lists obj4 = new Lists(4);
		Lists obj5 = new Lists(5);
		Lists obj6 = new Lists(6);
		Lists obj7 = new Lists(7);
		obj1.next  = obj2;
		obj2.next = obj3;
		obj3.next = obj4;
		obj4.next = obj5;
		obj5.next = obj6;
		obj6.next = obj7;
		obj7.next = null;
		LinkedList_SwapPairs actobj = new LinkedList_SwapPairs();
		Lists result = actobj.swapPairs(obj1);
		while(result!=null){
			System.out.println(result.val);
			result = result.next;

		}

	}

}
