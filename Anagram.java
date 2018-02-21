package dataStructures;

import java.util.Scanner;

public class Anagram {

	public boolean angrms(String one,String two){
		
		if(one.length() != two.length())return false;
		
		int [] letters = new int[256];
		
		
		for(int i=0; i<one.length();i++){
			letters[one.charAt(i)]++;
		}
		
		for(int j = 0; j<two.length();j++){
			int temp = two.charAt(j);
			letters[temp] = letters[temp]-1;
			if(letters[temp]<0)return false;
		}
		
		return true;
	}
	
	


	public static void main(String [] args){
		Scanner reader1 = new Scanner(System.in);
		System.out.println("Enter String 1");
		String one = reader1.next();
		Scanner reader2 = new Scanner(System.in);
		System.out.println("Enter String 2");
		String two = reader2.next();
		Anagram obj = new Anagram();
		boolean result = obj.angrms(one, two);
		System.out.println("It is an Anagram:"+result);
		reader1.close();
		reader2.close();
		
	}
	
}
