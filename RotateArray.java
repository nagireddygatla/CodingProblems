package dataStructures;

public class RotateArray {

	 public void rotate(int[] nums, int k) {
	        
		    if(k==0)return;
		    int n = nums.length;
		    k = n==0?0:k%n;
		    reverse(nums,0,n-k);
		    reverse(nums,n-k,n);
		    reverse(nums,0,n);
		    }
		    
		    public void reverse(int [] nums, int l, int r){
		        while(l<r){
		            int temp = nums[l];
		            nums[l++] = nums[--r];
		            nums[r] = temp;
		        }
		    }

}
