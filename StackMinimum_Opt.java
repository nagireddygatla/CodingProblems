package dataStructures;


//This is a program to design a stack with constant time push, pop and get minimum value
public class StackMinimum_Opt {
	
	MinStack head;
	
	public void push(int x){
		
		if(head==null){
			
			head = new MinStack(x,x);
			
		}
		else{
			
			head = new MinStack(x,Math.min(head.min, x),head);
		}
	}
	
	public void pop(){
		
		head = head.next;
	}

	public int getMin(){
		
		return head.min;
	}
	
	public int top(){
		
		return head.val;
	}
	public static void main(String [] args){
		
		StackMinimum_Opt obj = new StackMinimum_Opt();
		obj.push(2);
		obj.push(3);
		obj.push(5);
		obj.push(1);
		obj.push(5);
		obj.push(6);
		obj.pop();
		System.out.println("This is the minimum of stack:"+obj.getMin());
		System.out.println("This is the top of the stack:"+obj.top());
	}
	
	private class MinStack{
		
		int val;
		int min;
		MinStack next;
		
		public MinStack(int val, int min){
			
			this.val = val;
			this.min = min;
		}
		
		public MinStack(int val, int min, MinStack next){
			
			this.val = val;
			this.min = min;
			this.next = next;
			
		}
	}

}
