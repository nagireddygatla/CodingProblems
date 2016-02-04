package dataStructures;

public class StringCompression {

	public StringCompression() {
		// TODO Auto-generated constructor stub
	}
	
	static String input = "aabcccccadaaa";
	public static void main(String [] args){
		
		String init = input.substring(0,1);
		int k = 1;
		String temp = null;
		String fin="";
		
		
		for(int i= 1;i<input.length();i++){
			
			if(init.equalsIgnoreCase(input.substring(i,i+1))){
				
				k=k+1;
				
			}
			else{
				k=1;
				init = input.substring(i,i+1);
				
				fin = fin+temp;
			}
	
			temp = init+k;
			//System.out.println(temp);
			//if(init!=input.substring(i,i+1)){
			
			//}
		}
		fin = fin +temp;
		System.out.println(fin);
		
		
		
		//return null;
	}
	

}
