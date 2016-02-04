package dataStructures;

public class EntireRowColumnZero {

	private int[][] setZero(int [][] matrix, int m, int n){

		boolean [] row = new boolean[m];
		boolean [] col = new boolean[n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(matrix[i][j] == 0){

					row[i] = true;
					col[j] = true;
				}	
			}
		}

		for(int p=0;p<m;p++){

			for(int q=0;q<n;q++){
		
				if(row[p] || col[q]){
					matrix[p][q] =0;
				}
			}
		}

		return matrix;
	}
	

	public static void main(String []  args){

		EntireRowColumnZero obj = new EntireRowColumnZero();
		int matrix[][]={{1,2,0,4},{5,0,7,8},{9,10,11,12},{13,14,15,16}};
		int m = matrix.length;
		int n = matrix.length;
		matrix = obj.setZero(matrix, m, n);
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++)
			{
				System.out.println(matrix[i][j]);
			}
		}

	}
}
