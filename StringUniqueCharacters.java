package dataStructures;
import java.util.Scanner;

public class StringUniqueCharacters {

	public boolean unique(String s){
		s= s.toUpperCase();
		int strSize = s.length();
		String temp;
		for(int i=0;i<strSize;i++){
			temp = s.substring(i,i+1);
			System.out.println(temp);
			for(int j=0;j<strSize;j++){
				String temp1 = s.substring(j, j+1);
				System.out.println(temp1);
				if(i!=j && temp.equalsIgnoreCase(temp1)){
					return true;
				}
					System.out.println("i value:"+i+", j value:"+j);
			}
		}
		return false;
	}
	
	public static void main(String args[]){
		
		StringUniqueCharacters obj = new StringUniqueCharacters();
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a string to check: ");
		String input = reader.next(); // Scans the next token of the input as an int.
		boolean result = obj.unique(input);
		System.out.println("There is repetition:"+result);	
	}
	
	
}
