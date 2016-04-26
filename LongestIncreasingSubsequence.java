package dataStructures;
import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static int LIS(int [] arr){
		int [] actualSolution = new int[arr.length];
		int [] temp = new int[arr.length];
		for(int i=0;i<temp.length;i++){
			temp[i]=1;
			actualSolution[i] = i;
		}
		int second =0;
		
		for(int i=1;i<temp.length;i++){
			second = arr[i];
		for(int j=0;j<i;j++){
			if(second>arr[j]){
				temp[j] = Math.max(temp[i],temp[j]+1);
				//System.out.print(temp[j] +  " ");
				actualSolution[i] = j;		
			}
		}
		}
		
		int max = 0;
		for(int i =0;i<temp.length;i++)System.out.print(temp[i]);
		for(int iter:temp){	
			max = Math.max(max,iter);
		}
		
		System.out.println();
		return max;
	}
	
	public static void main(String [] args){
		int [] arr = {1,3,2,5,7,1};
		System.out.println(LIS(arr));
	}
}
