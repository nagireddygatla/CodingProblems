package dataStructures;
import java.util.Scanner;

public class StringUniqueCharacters_opt {
	
	public StringUniqueCharacters_opt next;
	public static StringUniqueCharacters_opt firstlink;
	
	
	boolean []charset = new boolean[256];
	public boolean unique(String s){
	if(s.length() >256) return true;
	for(int i = 0; i< s.length();i++){
		char poschar = s.charAt(i);
		if(charset[poschar]){
			return true;
		}
		charset[poschar] = true;	
	}
	return false;
	
	}
	
	public static void main(String args[]){
		
		StringUniqueCharacters_opt obj = new StringUniqueCharacters_opt();
		//StringUniqueCharacters_opt next;
		firstlink = obj.next;
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a string to check: ");
		String input = reader.next(); // Scans the next token of the input as an int.
		boolean result = obj.unique(input);
		System.out.println("There is repetition:"+result);	
	}
}
