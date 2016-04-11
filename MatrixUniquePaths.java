package dataStructures;

public class MatrixUniquePaths {
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