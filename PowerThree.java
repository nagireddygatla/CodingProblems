package dataStructures;
import java.util.Scanner;

public class PowerThree {

	 public boolean isPowerOfThree(int n) {
	        if(n==0) return true;
	        if(n==1) return false;
	        float res = (float) n;
	        
	        while(res != 1){
	        	res = res/3;
	        	if(res <1) {
	        		return false;
	        		}
	        	}
	        return true;
	    }
	
	public boolean powerThreeLog(int n){
		if(n<=0){
			return false;
		}
		Double res = Math.log10(n)/Math.log10(3);
		if(res%1==0){
			return true;
		}
		else{
			return false;	
		}
	}
	 
	public static void main(String [] args){	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value:");
		int val = input.nextInt();
		boolean result = (new PowerThree()).isPowerOfThree(val);
		System.out.println("This is power of 3:"+result);
	}
}