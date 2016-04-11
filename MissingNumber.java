package dataStructures;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        
        //if(nums.length==0)return 0;
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            
            sum = sum + nums[i];
            
        }
        
        int len = nums.length;
        int formula = (len * (len+1))/2;
        
        return formula-sum;
        
    }
}