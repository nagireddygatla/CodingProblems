package dataStructures;
import java.util.*;

public class DivideIntegers {
	
	public static void main(String [] args){
	System.out.println("Enter integer 1:");
	Scanner sc1 = new Scanner(System.in);	
	int dividend = sc1.nextInt();
	System.out.println("Enter integer 2:");
	Scanner sc2 = new Scanner(System.in);
	int divisor = sc2.nextInt();
	DivideIntegers obj = new DivideIntegers();
	int result = obj.divide(dividend,divisor);
	System.out.println("Division Result:"+result);
	
	}

    public int divide(int dividend, int divisor) {
        
		int sign = 1;
		if((dividend<0 && divisor>0) || (dividend>0 && divisor<0))sign=-1;

		long divsr = Math.abs(	divisor);
		long dividnd = Math.abs((long)dividend);
		System.out.println(dividnd);
    	System.out.println(divsr);
		if(divisor==0)return Integer.MAX_VALUE;
		if(dividend==0 || dividend<divisor)return 0;
		
		long lans = actualDivide(dividnd,divsr);
		int ans;
		if(lans>Integer.MAX_VALUE){
			
			ans = (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
			
		}else{
			ans = (int)(sign*lans);
		}
		
		
		return ans;

        
    }
    
    private static long actualDivide(long dividend, long divisor) {
		if(dividend<divisor)return 0;
		long sum = divisor;
		long multiple = 1;
		while((sum+sum)<=dividend){
			sum +=sum;
			multiple +=multiple;
		}
		return multiple+actualDivide(dividend-sum,divisor);
	}
}
