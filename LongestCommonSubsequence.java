package dataStructures;

public class LongestCommonSubsequence {

	public static int bruteForceLCS(String first, String sec,int m,int n){
		
		if(m==0 || n==0)return 0;
		
		if(first.charAt(m-1)==sec.charAt(n-1)){
			
			return 1 + bruteForceLCS(first,sec,m-1,n-1);
		}else{
			return Math.max(bruteForceLCS(first,sec,m,n-1),bruteForceLCS(first,sec,m-1,n));
		}
		
	}
	
	
	public static int DPLCS(String first, String sec,int m, int n){
		int [][] LCS = new int[m+1][n+1];		
		
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				
				if(i==0 || j==0){
					LCS[i][j] = 0;
				}
				
				else if(first.charAt(i-1)==sec.charAt(j-1)){
					
					LCS[i][j] = 1 + LCS[i-1][j-1];
				}
				else{
					
					LCS[i][j] = Math.max(LCS[i][j-1],LCS[i-1][j]);					
				}
				
				
			}
			
			
		}
		
		return LCS[m][n];
		
		
	}
	
	public static void main(String args []){
		
		String fir = "Nagired";
		String sec = "Npqlgzir";
		int res = bruteForceLCS(fir,sec,fir.length(),sec.length());
		System.out.println(res);
		System.out.println(DPLCS(fir,sec,fir.length(),sec.length()));
	}
	

}
