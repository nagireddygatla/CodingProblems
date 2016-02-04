package dataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public boolean angrms(String one,String two){
		if(one.length()!=two.length()) return false;
		String result1 = sort(one);
		String result2 = sort(two);
		System.out.println(result1);
		System.out.println(result2);
		if(result1.equalsIgnoreCase(result2)){return true;};
		return false;
	}
	
	
	public String sort(String s){
		
		char [] charArray = s.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}

	public static void main(String [] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter String 1");
		String one = reader.next();
		Scanner reader2 = new Scanner(System.in);
		System.out.println("Enter String 2");
		String two = reader2.next();
		Anagram obj = new Anagram();
		boolean result = obj.angrms(one, two);
		System.out.println("It is an Anagram:"+result);
		
	}
	
}
