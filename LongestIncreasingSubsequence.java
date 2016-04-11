package dataStructures;

public class LongestIncreasingSubsequence {

	
	public int LIS(int [] arr){
		
		int [] temp = new int[arr.length];
		
		for(int i=0;i<temp.length;i++)temp[i]=1;
	
		int second =0;
		
		for(int i=1;i<temp.length;i++){
			second = arr[i];
		for(int j=0;j<second;j++){
			if(second>arr[j])temp[j] = Math.max(temp[i],temp[j]+1);
		}
		}
		
		int max = 0;
		
		for(int iter:temp){
			
			max = Math.max(max,iter);
		}
		
		
		
		return max;
	}

}
