package dataStructures;

/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative 
 * order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].*/
public class MoveZeroes {


	public void moveZeroes(int[] nums) {
		int len = nums.length;
		int count=0;
        for(int i=0;i<len;i++){
        
        	if(nums[i]!=0){
        		nums[count]=nums[i];
        		count++;
        	}
        	
        }
        if(count<len){
        	
        	for(int i =count;i<len;i++){
        		
        		nums[i]=0;
        	}
        	
        }
        for(int i=0;i<len;i++){
        	System.out.println(nums[i]);
        }
        
    }
	public static void main(String [] args){
		int [] nums = {0,1,3,4,0,9};
		
		MoveZeroes obj = new MoveZeroes();
		obj.moveZeroes(nums);
	}

}
