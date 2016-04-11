package dataStructures;

import java.util.*;

public class StackTowerHanoi {

	@SuppressWarnings("unchecked")
	static Stack<Integer> [] stackArr = new Stack[4];
	
	@SuppressWarnings("resource")
	public static void main(String [] args){
		
		stackArr[1] = new Stack<Integer>();
		stackArr[2] = new Stack<Integer>();
		stackArr[3] = new Stack<Integer>();
		
		Scanner inp = new Scanner(System.in);
		int input = inp.nextInt();
		towerHanoi(input);
		while(!stackArr[3].isEmpty()){
	
			System.out.println(stackArr[3].pop());
		}
	}
	
	public static void towerHanoi(int num){
		
		for(int i = num;i>0;i--){
			
			stackArr[1].push(i);
		}
		
		beadsMove(num,1,2,3);
		
	}
	
	public static void beadsMove(int num,int a,int b, int c){
		
		if(num>0){
			
			beadsMove(num-1,a,c,b);
			int temp = stackArr[a].pop();
			stackArr[c].push(temp);
			beadsMove(num-1,b,a,c);
			
		}
		
		
	}
	
	
}

