package basicAlgorithms;

import java.util.Arrays;

/* Class HeapSort */
public class HeapSort 
{    
    
	private static int N;
	
	public  int [] sort(int [] arr){
		N = arr.length-1;
		maxHeapifySort(arr);
		for(int i = N;i>0;i--){
			swap(arr,0,i);
			N=N-1;
			maxHeapify(arr,0);
		}
		return arr;
	}

	private void maxHeapifySort(int[] arr) {
		
		for(int i =N/2;i>=0;i--){
			
			maxHeapify(arr,i);
		}
		
		
	}

	private void swap(int[] arr, int start, int end) {
		
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	private void maxHeapify(int[] arr, int i) {
		
		int heapSize = N;
		int left = 2*i;
		int right = 2*i+1;
		int max = 0;
		if(left<=heapSize && arr[left] > arr[i])
			max= left;
		else
			max = i;
		if(right<=heapSize && arr[right] > arr[i])
			max= right;
		else
			max = i;

		if(i!=max){
			swap(arr,i,max);
			maxHeapify(arr,max);
		}
		
	}

	
	
	public static void main(String [] args){
		
		int arr [] = {8,4,1,7,6,0};
		arr = new HeapSort().sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
}