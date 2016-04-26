package dataStructures;

public class SortedArrayMinimum {

	    public int findMin(int[] nums) {
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
	    		else {
	    		    if(nums[start]<nums[end])return nums[start];
	    	}
	    	}
			return nums[end];
	    }
	

}
