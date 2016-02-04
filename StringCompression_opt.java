package dataStructures;

public class StringCompression_opt {
	
	static String input = "aabccccccadaaa";
	public static void main(String [] args){
		
		char init = input.charAt(0);
		int k = 1;
		StringBuilder fin = new StringBuilder();
		//String fin="";
		for(int i= 1;i<input.length();i++){
			
			if(init == input.charAt(i)){
				
				k=k+1;
				
			}
			else{
				fin.append(init);
				fin.append(k);
				k=1;
				init = input.charAt(i);	
			}
		}
		fin.append(init);
		fin.append(k);
		System.out.println(fin);
	}
}
