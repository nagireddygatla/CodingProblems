package dataStructures;
import java.util.Scanner;

/*You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? */

public class climbStairsFibonacci {

    int [] dp;
    public int climbStairs(int n) {
        
        dp = new int[n+2];
        for(int i =0;i<n+2;i++){
            dp[i]=-1;
        }

       int res = climb(n+1);
       return res;
    }
    
    public int climb(int inp){
    if(inp==0)return 0;
    if(inp==1) return 1;
    if(dp[inp]!=-1) return dp[inp];
    
    return dp[inp] = climb(inp-1)+climb(inp-2);
    }

    public static void main(String args []){
    	Scanner inp = new Scanner(System.in);
    	int n = inp.nextInt();
    	climbStairsFibonacci obj = new climbStairsFibonacci();
    	
    	System.out.println("Recursive Solution:"+obj.climbStairs(n));
    	System.out.println("Iterative Solution:"+obj.alternateClimbStairs(n));
    	
    	
    	
    }
    
    public int alternateClimbStairs(int n){
    	int first = 1;
    	int second =1;
    	int temp = 0;
    	
    	while(--n>0){
    		
    		temp = second;
    		second = first + second;
    		first = temp;
    	}
    	
    	return second;
    	
    	
    }
    
    
}
