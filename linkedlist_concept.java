package dataStructures;

class Node{

	int nodeint;
	Node next;

	public Node(int nodeint){
		this.nodeint = nodeint;

	}
}

public class Linkedlist_concept{

	Node head;
	public Linkedlist_concept(Node obj){

		this.head = obj;
	}

	public Node addnodes(int news){
		Node newlink = new Node(news);
		newlink.next = head;
		head = newlink;
		return head;
	}

	public void printAllNodes(){
		Node current  = head;
		while(current!=null){
			System.out.println(current.nodeint);
			current = current.next;

		}
	}

	public void remove(){

		Node temp = head;
		head = head.next;
		temp.next = null;

	}

	public void printHead(){
		System.out.println("This is the present head node"+head.nodeint);

	}

	public static void main(String [] args){	

		Node obj1 = new Node(2);
		Node obj2 = new Node(3);
		Node obj3 = new Node(4);
		obj1.next  = obj2;
		obj2.next = obj3;
		obj3.next = null;
		Linkedlist_concept newobj = new Linkedlist_concept(obj1);
		Node obj = null;
		obj = newobj.addnodes(5);
		obj =newobj.addnodes(20);
		newobj.printAllNodes();
		newobj.remove();
		System.out.println("A node is deleted");
		newobj.printAllNodes();
		newobj.printHead();

	}
}