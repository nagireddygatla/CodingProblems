package dataStructures;

public class MaximumSubarray {

	public int maxsub(int [] nums){
		if(nums==null || nums.length==0)return Integer.MIN_VALUE;
		
		int pre = nums[0];
		int max = nums[0];
		for(int i=1;i<nums.length;i++){
			
			pre = Math.max(nums[i], nums[i]+pre);
			max= Math.max(max, pre);
		}
		
		return max;
	}

}
