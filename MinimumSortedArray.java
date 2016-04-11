package dataStructures;

/*Suppose a sorted array is rotated at some pivot unknown to you beforehand.
(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
Find the minimum element. You may assume no duplicate exists in the array.
*/
public class MinimumSortedArray {
	
	//This is order n solution
    public int findMin(int[] nums) {
        
    	int first = nums[0];
    	for(int i = 1;i<nums.length;i++){
    		
    		if(first<nums[i])first = nums[i];
    		else{
    			first = nums[i];
    		}	
    	}
    	return first;	
    }
    
    
    //This is an optimized binary search solution - order logn solution.
    public int findMin_opt(int[] nums) {
    	int start = 0;
    	int end = nums.length-1;
    	int mid=0;
    	while(end>start){
    		mid = start + (end-start)/2;
    		if(nums[mid]<nums[start]){
    			
    			end = mid;
    		}
    		else if(nums[mid]>nums[end]){
    			
    			start=mid+1;
    		}
    		else{
    			if(nums[start]<nums[end])return nums[start];
    		}
    		
    	}
		return nums[end];
    }

    
}
