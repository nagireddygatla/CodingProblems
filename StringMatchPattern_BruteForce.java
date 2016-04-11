package dataStructures;
	public class StringMatchPattern_BruteForce {

	
	public static int matchBrute(String str,String pattern){
	
		char [] input = str.toCharArray();
		char [] pat = pattern.toCharArray();
		int i=0,j=0,k=0;
		while(i<input.length){
			
			if(input[i]==pat[j]){
				i++;
				j++;
			if(j==pat.length)return k;
			}
			else{
				j=0;
				k=k+1;
				i=k;
			}
		}
		
		return 0;
		
	}
	
	public static void main(String [] args){
		String input = "abnpabpnapabpnab";
		String pattern = "pnap";
		//int k = n%2==0?3:2;
		System.out.println(matchBrute(input,pattern));
		
	}

}
