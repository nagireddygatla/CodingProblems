package dataStructures;


/*A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner 
of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?*/
public class NumberOfPaths_Matrix {

    public int uniquePaths(int m, int n) {
        int [] path = new int[m];
        path[0] = 1;
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){

                path[j] = path[j-1]+path[j];
                
            }
        }
        
        return path[m-1];
        
    }

}
