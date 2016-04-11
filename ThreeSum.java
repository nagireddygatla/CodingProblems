package dataStructures;
import java.util.*;
public class ThreeSum {

public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            
            if(nums[i]>0)break;
            if(i>0 && nums[i]==nums[i-1])continue;
            
            int low = i+1;
            int high = nums.length-1;
            int sum = -nums[i];
            
            while(low<high){
                
                if(nums[low]+nums[high]==sum)
                {
                result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                while(low<high && nums[low]==nums[low+1])low++;
                low++;
                while(low<high && nums[high]==nums[high-1])high--;
                high--;
            }
            else if(nums[low]+nums[high]<sum){
                while(low<high && nums[low]==nums[low+1])low++;
                low++;
                
            }
            else{
                while(low<high && nums[high]==nums[high-1])high--;
                high--;
            }
        }
    }
    return result;
}

}
