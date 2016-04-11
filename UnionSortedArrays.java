package dataStructures;

public class UnionSortedArrays {
	//Just merge two sorted arrays into one sorted array and return Kth element in the merged array
	public static int unionkthBrute(int [] array1, int [] array2, int k){
	
		if(array1.length==0 && array2.length==0)return 0;
		if(k>array1.length+array2.length)return 0;
		if(k==array1.length && array2.length==0)return array1[k-1];
		if(k==array2.length && array1.length==0)return array2[k-1];
		int len1 = array1.length-1;
		int len2 = array2.length-1;
		int [] arraynew = new int[len1+len2+2];
		int i=0,j=0,l=0;
		
		while(len1>=0 && len2 >=0){
			if(array1[i]>=array2[j]){
				arraynew[l] = array2[j];
				j++;
				l++;
				len2--;
				
			}
			else{
				arraynew[l] = array1[i];
				i++;
				l++;
				len1--;	
			}	
		}
		if(len2<0){
			while(i<=array1.length-1){
				
				arraynew[l] = array1[i];
				i++;
				l++;
			}
		}
		else{
			
				while(j<=array2.length-1){
				
				arraynew[l] = array2[j];
				j++;
				l++;
			}
		}
		return arraynew[k-1];
	}
	
	public static void main(String args []){
		int [] a1 = {1,2,3,4,6,7,13};
		int [] a2 = {5,7,8,10,11,12};
		int k = 11;
		//System.out.println(unionkthBrute(a1,a2,k));
		//System.out.println(unionkthBetter(a1,a2,k));
		System.out.println(unionKthBest(a1,a2,k));
	}
	
	
	public static int unionkthBetter(int [] array1, int [] array2, int k){
		
		int len1 = array1.length-1;
		int len2 = array2.length-1;
		int i=0,j=0;
		while(len1>=0 && len2>=0){
	
			if(array2[j]<=array1[i]){
				if(i+j==k-1)return array2[j];
				j++;
				len2--;
			}
			else{
				if(i+j==k-1)return array1[i];
				i++;
				len1--;
			}
			
		}

		if(len2<0)return array1[k-i-1];
		if(len1<0)return array2[k-j-1];
		
		return 0;
	}

	
	public static int unionKthBest(int[] A, int[] B, int k) {
        if (A == null || B == null) {
            throw new IllegalArgumentException("Arrays cannot be null!");
        }
 
        int a = A.length;
        int b = B.length;
 
        if (k < 1 || k > a + b) {
            throw new IllegalArgumentException("k is not within range!");
        }
 
        int minSizeA = Math.max(0, k - b);
        int maxSizeA = Math.min(a, k);
 
        while (minSizeA <= maxSizeA) {
            int sizeA = minSizeA + (maxSizeA - minSizeA) / 2;
            int sizeB = k - sizeA;
            int indexA = sizeA - 1;
            int indexB = sizeB - 1;
            int indexANext = sizeA;
            int indexBNext = sizeB;
            int valA = (indexA < 0) ? Integer.MIN_VALUE : A[indexA];
            int valB = (indexB < 0) ? Integer.MIN_VALUE : B[indexB];
            int valANext = (indexANext >= a) ? Integer.MAX_VALUE : A[indexANext];
            int valBNext = (indexBNext >= b) ? Integer.MAX_VALUE: B[indexBNext];
 
            if (valA <= valBNext && valB <= valANext) {
                return Math.max(valA, valB);
            } else if (valA > valBNext) {
                maxSizeA = sizeA - 1;
            } else {
                minSizeA = sizeA + 1;
            }
        }
 
        return 0;
    }	
}
