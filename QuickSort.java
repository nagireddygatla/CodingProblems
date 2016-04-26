package basicAlgorithms;

public class QuickSort {

	
	public static int [] quickSort(int [] array, int start, int end){
		
		if(end>start){
			int partitionIndex = partition(array,start,end);
			quickSort(array,start,partitionIndex-1);
			quickSort(array,partitionIndex+1,end);
		}
		return array;
	}
	
	public static int partition(int [] array, int start, int end){
		
		int pIndex = start;
		int pivot = array[end];
		
		for(int i = start;i<end;i++){
			
			if(array[i] <= pivot){
				
				int temp = array[i];
				array[i] = array[pIndex];
				array[pIndex] = temp;
				pIndex = pIndex+1;		
			}
		}
		int temp = array[pIndex];
		array[pIndex] = array[end];
		array[end] = temp;
		return pIndex;
	}
	
	
	public static void main(String args []){
		
		int [] array = {2,2,5,1,5,23,6,78,3};
		
		array = quickSort(array,0,array.length-1);
		
		for(int i = 0;i<array.length;i++){
			
			System.out.println(array[i]);
		}
	}

}
