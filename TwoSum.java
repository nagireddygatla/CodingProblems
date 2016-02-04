package dataStructures;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;


/*Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, 
where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2*/

public class TwoSum {
	
	public static int[] twoSumNums(int [] inArr,int res){
		
		Hashtable<Integer,Integer> store = new Hashtable<Integer,Integer>();
		int [] output = new int[2];
		
		for(int i=0;i<inArr.length;i++){
			
			
			if(store.containsKey(inArr[i])){
				 
				output[1] = i;
				output[0] = store.get(inArr[i]);	
				
			}else{
				
				store.put(res-inArr[i],i);
			}
			
			
		}
		
		
		return output;
	}
	
	
	public static void main(String [] args){
		
		int [] inputArray = {0,4,3,0};
		int input = 0;
		int [] res;
		res = twoSumNums(inputArray,input);
		System.out.println(res[0]);
		System.out.println(res[1]);
		
		
		
		
	}

}
