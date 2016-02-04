package dataStructures;

import java.util.Arrays;

public class LargestElement {

	public LargestElement() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String [] args){
		
		int [] input = {3,2,1,5,6,4};
		int k = 3;
		Arrays.sort(input);
		
		System.out.println(input[input.length - k]);
		
		
		
	}

}
