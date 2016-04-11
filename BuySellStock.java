package dataStructures;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        
        if(prices.length==0)return 0;
        
        int bought = prices[0];
        int profit=0;
        
        for(int i = 1;i<prices.length;i++){
            
            if(bought<prices[i]){
                if(profit<prices[i]-bought)
                profit = prices[i]-bought;
                
            }
            else{
                bought = prices[i];
            }
        }
        
        return profit;
        
    }
}