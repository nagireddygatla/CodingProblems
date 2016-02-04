package dataStructures;

/*
Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
*/public class RemoveElement {

public static int removeElement(int[] nums, int val) {
       int len = nums.length;
       int valnum=0;
       for(int i =0 ;i<len;i++){
    	   
    	   if(nums[i]!=val){
    		   nums[valnum] = nums[i];
    		   valnum++;
    	   }
       }
		
	return valnum;
    }

	public static void main(String [] args){
		int [] in = {1,2,3,4,5};
		int val = 3;
		int res = removeElement(in,val);
		System.out.println(res);
		
	}

}
