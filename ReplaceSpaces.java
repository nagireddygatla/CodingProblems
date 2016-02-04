package dataStructures;

public class ReplaceSpaces {

	public ReplaceSpaces() {
		// TODO Auto-generated constructor stub
	}
	static String input = "My Name is Nagi";
	
	public static void replacespace(){
		int spaceCount = 0;
		char [] charArray = input.toCharArray();
		for(int i=0;i<charArray.length;i++){
			if(charArray[i]==' '){
				spaceCount++;	
			}
		}
		char [] newarray = new char [input.length()  + spaceCount*2];
		int k = 0;
		for(int i=0;i<charArray.length;i++){
			if(charArray[i]==' '){
				newarray[k] = '%';
				newarray[k+1] = '2';
				newarray[k+2] = '0';
				k = k+3;
			}
			else{	
				newarray[k] = charArray[i];
				k=k+1;
			}	
		}
		System.out.println(new String(newarray));
	}
	
	public static void main(String [] args){
		
		replacespace();
		
	}


}
