package dataStructures;

import java.util.Scanner;
//This is the program where in we use one array and build three stacks from it.
public class StacksArrayThree {

	int stackSize = 4;
	int [] stackArray = new int[stackSize * 3];
	int [] stackpointer = {-1,-1,-1};
	
	public int push(int stackNum, int val){
		
		if(stackpointer[stackNum]+1>stackSize){
			System.out.println("The size of the stack exceeded");
		}
		stackpointer[stackNum]++;
		stackArray[stackNum*stackSize+stackpointer[stackNum]] = val;
		return val;
	}
	
	
	public int pop(int stackNum){
		int val = stackArray[stackNum*stackSize+stackpointer[stackNum]];
		stackArray[stackNum*stackSize+stackpointer[stackNum]] = 0;
		stackpointer[stackNum]--;
		return val;
		
	}
	
	public int peek(int stackNum){
		
		return stackArray[stackSize*stackNum + stackpointer[stackNum]];
	}
	
	
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter each stack size:");
		int size = in.nextInt();

		StacksArrayThree obj  = new StacksArrayThree();
		int stackNum = 0;
		System.out.println("Enter elements now of stack");
		for(int i = 0;i<size*3;i++){
			Scanner sc = new Scanner(System.in);
			int temp = sc.nextInt();
			obj.push(stackNum, temp);
			stackNum = stackNum<2?stackNum+1:0;
		}
		
		System.out.println("This element deleted stack1:"+obj.pop(0));
		System.out.println("This element deleted stack2:"+obj.pop(1));
		System.out.println("This element deleted stack3:"+obj.pop(2));
		
		System.out.println("This is top element stack1:"+obj.peek(0));
		System.out.println("This is top element stack2:"+obj.peek(1));
		System.out.println("This is top element stack3:"+obj.peek(2));
		
	}

}
