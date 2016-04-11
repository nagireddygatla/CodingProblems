package dataStructures;

public class KthLargestElement {

	public static int KthLargest(int [] array, int k){
		
		if(array ==null || array.length==0 || k>array.length)return Integer.MAX_VALUE;
		k=k-1;
		return KthLargest(array,0,array.length-1,k);
	}
	
	public static int KthLargest(int [] array, int start, int end, int k){
		
		if(start>end)return Integer.MAX_VALUE;
		
		int pIndex = start;
		int pivot = array[end];
		
		for(int i=start;i<end;i++){
			
			if(array[i]<=pivot){
				int temp = array[pIndex];
				array[pIndex] = array[i];
				array[i] = temp;
				pIndex++;
			}
			
		}
		
		int temp = array[end];
		array[end] = array[pIndex];
		array[pIndex] = temp;
		
		if(pIndex==k)return array[pIndex];
		else if(pIndex>k)return KthLargest(array,start,pIndex-1,k);
		else return KthLargest(array,pIndex+1,end,k);
		
	}
	public static void main(String [] args){
		
		
		int [] array = {5,6,7,1,2,3,4};
		int k = 4;
		System.out.println(KthLargest(array, k));
		
	}

}
