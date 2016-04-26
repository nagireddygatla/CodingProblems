package dataStructures;

public class CoinChange_Leetcode {

   
	
	    public int coinChange(int[] coins, int amount) {
	        if(amount==0)
	            return 0;
	        int n = amount+1;
	        for(int coin : coins) {
	            int curr = 0;
	            if (amount >= coin) {
	                int next = coinChange(coins, amount-coin);
	                if(next >= 0)
	                    curr = 1+next;
	            }
	            if(curr > 0)
	                n = Math.min(n,curr);
	        }
	        int finalCount = (n==amount+1) ? -1 : n;
	        return finalCount;
	    }
	
	    
	    public int coinChangeRecurse(int [] coins, int amount){
	    	
	    	if(coins==null || coins.length==0 || amount<0){
	    		
	    		return -1;
	    	}
	    	int [] DP = new int[amount+1];
	    	
	    	for(int sum=1;sum<=amount;sum++){
	    		DP[sum] = Integer.MAX_VALUE;
	    		
	    		for(int coin:coins){
	    			if(coin<=sum && DP[sum-coin]!=-1)
	    			DP[sum] = Math.min(DP[sum],1+DP[sum-coin]);
	    			
	    		}
	    		if(DP[sum]==Integer.MAX_VALUE)DP[sum]=-1;
	    		
	    	}
	    	
	    	return DP[amount];
	    	
	    }
	
	public static void main(String [] args){

        long now = System.nanoTime();
		CoinChange_Leetcode obj = new CoinChange_Leetcode();
		int [] input = {1,2,5};
		int target = 11;
		System.out.println(obj.coinChangeRecurse(input,target));
		System.out.println(System.nanoTime()-now);
		
	}
    		
    		
    		
    	
    	
    

}