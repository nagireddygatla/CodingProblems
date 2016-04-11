package dataStructures;

public class IslandsNumberDP {

	 public int numIslands(char[][] grid) {
	        
	        if(grid.length==0)return 0;
	        int row = grid.length;
	        int col = grid[0].length;
	        int count=0;
	       
	        for(int i=0;i<row;i++){
	            for(int j=0;j<col;j++){
	            	
	                if(grid[i][j]=='1'){       
	                    count++;
	                    DFS(grid,i,j);
	                }
	                
	            }
	        }
	        return count;
	        
	    }
	    
	    public void DFS(char[][] grid,int r, int c){
	        
	        if(r<0 || c<0 || r > grid.length-1 || c > grid[0].length-1)
	        return;
	        
	        if(grid[r][c]=='1'){
	            
	            grid[r][c]='2';
	            
	            DFS(grid,r+1,c);
	            DFS(grid,r-1,c);
	            DFS(grid,r,c+1);
	            DFS(grid,r,c-1);
	        }
	    }
	    
	    public  static void main(String [] args){
	    	
	    	char [][] in = {{'1'}};
	    	System.out.println(new IslandsNumberDP().numIslands(in));
	    }
}
