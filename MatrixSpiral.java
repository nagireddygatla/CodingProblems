package dataStructures;

import java.util.ArrayList;
import java.util.List;

public class MatrixSpiral {

	public List<Integer> spiral(int [][] matrix){
		
		int m = matrix.length;
		int n = matrix[0].length;
		List<Integer> list = new ArrayList<Integer>();
		int i;
		int k=0,l=0;
		
		while(k<m && l<n){
			
			for(i=l;i<n;i++){
				System.out.println(matrix[k][i]);
				list.add(matrix[k][i]);
			}
			k++;
			
		for(i=k;i<m;i++){
				
				System.out.println(matrix[i][n-1]);
				list.add(matrix[i][n-1]);
			}
			n--;
			
			if(k<m){
		for(i=n-1;i>=l;i--){
			
			System.out.println(matrix[m-1][i]);
			list.add(matrix[m-1][i]);
		}
		
		m--;
		
			}
		
		if(l<n){
		for(i=m-1;i>=k;i--){
				
			System.out.println(matrix[i][l]);
			list.add(matrix[i][l]);
		}
		l++;
			}	
		}
		return list;
	}
	
	
	
	public static void main(String [] args){
		
		int [][] matrix = {{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12}};
		MatrixSpiral obj = new MatrixSpiral();
		obj.spiral(matrix);
		
	}
}
