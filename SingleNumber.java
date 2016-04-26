package dataStructures;

import java.util.HashSet;
import java.util.Set;

	
	

public class SingleNumber {

	public int singleNum(int [] nums){
		int result = 0;

		for(int i:nums){
			result ^= i;
			System.out.println(result);
		}
		
		return result;
	}
	
    public int singleNumber(int[] nums) {
    	Set<Integer> set = new HashSet<Integer>();
    	for(int i = 0;i<nums.length;i++){
    		
    	if(!set.add(nums[i]))set.remove(nums[i]);
    	
    	}
    	
    	int value=0;
    	for(Integer val:set){
    		value=val;
    	}
    	return value;
    }
	

    
    public static void main(String [] args){

		SingleNumber obj = new SingleNumber();
		int [] input = {1,2,1,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,222,0,0};
		int res1 = obj.singleNumber(input);
		int res = obj.singleNum(input);
		System.out.println("This is the repeated element:"+res);
	

}
	
}
