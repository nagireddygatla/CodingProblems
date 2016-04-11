package dataStructures;

public class InsertPositionBinarySearch {

	
	public int searchInsert(int [] nums, int target){
		
			int start = 0;
			int end = nums.length-1;
			int mid = 0;
			while(end-start!=0){
				
				mid = start + (end-start)/2;
				if(target==nums[mid])return mid;
				if(target >nums[mid]){
					
					start = mid+1;
					
				}
				else{
					end=mid;
				}
				
				
				
			}
			if(target<=nums[start])return start;
			//if(target<=nums[end])return end;
			
			return end+1;
		
	}

	public static void main(String [] args){
		
		int [] arr = {1,2,3,5,7,8};
		int target = 6;
		InsertPositionBinarySearch obj = new InsertPositionBinarySearch();
		System.out.println(obj.searchInsert(arr, target));
			
		
	}
	
}
