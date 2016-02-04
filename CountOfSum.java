package dataStructures;

public class CountOfSum {

	static int [][] DP;
	public int countSum(int n,int start){

		if(n==0)
			return 1;

		if(DP[n][start] != -1)
			return DP[n][start];

		int ret = 0;

		for(int i = start;i<=n;i++){
			
			ret += countSum(n-i,i);
		}

		return DP[n][start] = ret;
	}


	public static void main(String [] args){

		CountOfSum obj = new CountOfSum();
		int n = 3;
		DP = new int[n+1][n+1];

		for(int i=0;i<n+1;i++){
			for(int j = 0;j<n+1;j++){
				DP[i][j]=-1;
			}
		}	
		int res = obj.countSum(n,1);
		System.out.println(res);

	}
}
