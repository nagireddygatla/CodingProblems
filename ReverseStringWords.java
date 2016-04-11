package dataStructures;

import java.util.Scanner;

public class ReverseStringWords {

	
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String result = reverseLine(input);
		System.out.println(result);
		
	}

	private static String reverseLine(String input) {
		input = input.trim();
		StringBuilder sb = new StringBuilder();
		String [] array = input.split(" +");
		for(int i = array.length-1; i>0 ; i--){
			sb.append(array[i] + " ");
		}
		 sb.append(array[0]);
		return sb.toString();
	}

}
