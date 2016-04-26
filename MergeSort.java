package basicAlgorithms;

import java.util.*;

public class MergeSort
{
	public static void main(String[] args)
	{
		Integer[] a = {2, 6, 3, 5, 1};
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	}

	private static void mergeSort(Comparable[] a) {
		
		Comparable [] temp = new Comparable[a.length];
		mergeSort(a,temp,0,a.length-1);
	}

	private static void mergeSort(Comparable[] a, Comparable[] temp, int left,
			int right) {
		
		if(left<right){
			
			int center = (left + right)/2;
			mergeSort(a,temp,left,center);
			mergeSort(a,temp,center+1,right);
			merge(a,temp,left,center+1,right);
			
			
			
		}
		
		
	}

	private static void merge(Comparable[] a, Comparable[] temp, int left,
			int right, int rightend) {
		
		int leftend = right -1;
		int k = left;
		System.out.println(k);
		int nums = rightend - left + 1;
		
		while(left <= leftend && right <= rightend){
		
			if(a[left].compareTo(a[right])<=0){	
			temp[k++] =	a[left++];
			}
			else{
				temp[k++] = a[right++];
			}
		}
		
		while(left<=leftend){
			temp[k++] = a[left++];
		}
		
		while(right<=rightend){
			temp[k++] = a[right++];
		}
		
		for(int i = 0;i<nums;i++,rightend--){
			a[rightend] = temp[rightend];
		}
		
	}

	
 }

