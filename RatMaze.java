package dataStructures;

public class RatMaze {

	public boolean routeMaize(int [][] M){
		
		int N = M.length;
		int [][] sol = new int[N][N];
		
		if(!mazeUtil(M,0,0,sol)){
			
			System.out.println("No route found");
			return false;
		}
		for(int i =0;i<N;i++){
			for(int j=0;j<N;j++){
				System.out.print(" "+sol[i][j]+" ");
				
			}
			System.out.println();
		}
		return true;
	}

	private boolean mazeUtil(int[][] m, int x, int y, int[][] sol) {
		
		if(x==m.length-1 && y==m.length-1){
			
			sol[x][y]=1;
			return true;
		}
		if(isSafe(m,x,y)){
			sol[x][y]=1;
			if(mazeUtil(m, x+1, y, sol))return true;
			if(mazeUtil(m, x, y+1, sol))return true;
			sol[x][y]=0;	//Backtracking step
			return false;
		}
		return false;
	}

	private boolean isSafe(int[][] m, int x, int y) {
		if(x>=0 && x<m.length && y>=0 && y<m.length && m[x][y]==1)return true;
		return false;
	}
	
	public static void main(String args[])
    {
        RatMaze rat = new RatMaze();
        int maze[][] = {{1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        rat.routeMaize(maze);
    }

}
