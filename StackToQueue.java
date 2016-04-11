package dataStructures;
import java.util.Stack;

//This program is used to implement a queue using two stacks!
public class StackToQueue {
		
	Stack<Integer> stackNew = new Stack<Integer>();
	Stack<Integer> stackOld = new Stack<Integer>();
	
	
	public void push(int val){
		stackNew.push(val);
	}
	
	public int getSize(){
		return stackNew.size()+stackOld.size();
	}
	
	public void checkStack(){
		if(stackOld.isEmpty()){
			while(!stackNew.isEmpty()){
				stackOld.push(stackNew.pop());
			}	
		}
	}
	
	public Integer pop(){
		checkStack();
		return stackOld.pop();
	}
	
	public int peek(){
		checkStack();
		return stackOld.peek();	
	}
	
	public static void main(String [] args){
		
		StackToQueue obj = new StackToQueue();
		obj.push(5);
		obj.push(3);
		obj.push(4);
		obj.push(1);
		obj.getSize();
		System.out.println(obj.pop());
		System.out.println(obj.peek());
		
	}

}
