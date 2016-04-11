package dataStructures;

public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
       if(nums.length==0)return null;
       
       int [] result = new int[nums.length];
       
       for(int i =0;i<result.length;i++)result[i]=1;
       int left = 1;
       int right =1;
       
       for(int i =0,j=nums.length-1;i<nums.length-1;i++,j--){
           
           left *= nums[i];
           right *=nums[j];
           
           result[i+1] *= left;
           result[j-1] *= right;
           
       }
       
        return result;
    }
}

/*public class Solution {
    public int[] productExceptSelf(int[] nums) {
       if(nums.length==0)return null;
       
        int prod = 1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            prod = prod*nums[i];
            else {
                count++;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
            if(count>1)nums[i]=0;
            else nums[i] = prod;
            }
            else {
            if(count>0)nums[i]=0;
            else nums[i]=prod/nums[i];
            }
        }
        return nums;
    }
}*/