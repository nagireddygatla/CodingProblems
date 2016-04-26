package dataStructures;
public class RotateMatrix_90Degrees {

	public static int[][] rotate(int[][] matrix, int n) {

		int first = 0;
		int last = 0;
		int offset = 0;
		int top = 0;
		for(int layer=0;layer<n/2;layer++){
			first = layer;
			last = n -1 - layer;
			for(int i=first;i<last;i++){
				offset = i-first;
				top = matrix[first][i];
				matrix[first][i] = matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
		return matrix;
		 }

	public static void main(String [] args){
		int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int size = matrix.length;
		//System.out.println(size);
		matrix = rotate(matrix,size);
		//System.out.println(matrix[3][3]);
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++)
			{
				System.out.println(matrix[i][j]);
			}
		}
		
	}
	
	
}
