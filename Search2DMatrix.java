package dataStructures;

public class Search2DMatrix {

	public boolean searchMatrix(int[][] matrix, int target) {
	    int rowSize = matrix.length, colSize = matrix[0].length;
	    for(int i=0; i<rowSize; i++) {
	        if(target >= matrix[i][0] && target <= matrix[i][colSize-1]) {
	            return binarySearch(matrix[i], 0, colSize-1, target);
	        }
	    }
	    return false;
	}

	public boolean binarySearch(int[] array, int start, int end, int target) {
	    if(start > end) return false;
	    int middle = (start + end) / 2;
	    if(array[middle] == target) return true;
	    else if(array[middle] < target) return binarySearch(array, middle+1, end, target);
	    else return binarySearch(array, start, middle-1, target);
	}

}
