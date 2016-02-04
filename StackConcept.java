package dataStructures;

import java.util.Stack;

public class StackConcept {

	static StackNode top;
	
	public static StackNode push(StackNode newtop, StackNode top){
		newtop.next = top;
		top = newtop;
		return newtop;
		
	}
	
	public static StackNode pop(StackNode top){
		if(top!=null){
		StackNode temp=top;
		top = top.next;
		return temp;
		}
		return null;
	}
	
	public static int peek(){
		Stack<Integer> temp = new Stack<Integer>();
		temp.push(123);
		temp.push(345);
		
		System.out.println(temp.peek());
		return top.val;
		
	}
	
	
	
	public static void main(String args []){
		
		top = new StackNode(1);
		StackNode sec = new StackNode(2);
		StackNode third = new StackNode(3);
		StackNode fourth = new StackNode(4);
		StackNode newtop = new StackNode(0);
		top.next = sec;
		sec.next = third;
		third.next = fourth;
		fourth.next = null;
		StackNode res = push(newtop,top);
		while(res!=null){
			System.out.println(res.val);
			res = res.next;
		}
		System.out.println("This is the popped out value after push:"+pop(newtop).val);
		
		System.out.println("THis is the top value after pop:"+peek());
	
	}

}

class StackNode{
	
	StackNode next;
	int val;
	
	public StackNode(int val){
		this.val =val;
		
	}
	
	
	
}
