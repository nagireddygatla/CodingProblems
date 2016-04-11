package dataStructures;

import java.util.Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
    
    if(nums==null || nums.length==0)return false;
    
    Arrays.sort(nums);
    int len = nums.length;
    int prev = nums[0];
    
    for(int i=1;i<len;i++){
        
        if(nums[i]==prev)return true;
        prev=nums[i];
        
        
    }
    
    return false;
}
}