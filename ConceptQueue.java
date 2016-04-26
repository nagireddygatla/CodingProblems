package dataStructures;

public class ConceptQueue {
	
	public static void main(String [] args){
		
		QueueNode first = new QueueNode(2);
		QueueNode third = new QueueNode(3);
		QueueNode last = new QueueNode(4);
		first.next = third;
		third.next = last;
		last.next = null;
		
		ConceptQueue newobj = new ConceptQueue();
		
	}

}


class QueueNode{
	
	QueueNode next;
	int val;
	public QueueNode(int val){
		
		this.val = val;
	}
	
	
	
}