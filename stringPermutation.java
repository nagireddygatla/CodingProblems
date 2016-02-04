package dataStructures;

import java.util.Scanner;

public class stringPermutation {

	public stringPermutation() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean permutation(String one, String two){
		int k =0;
		char [] onechar = one.toCharArray();
		char [] twochar = two.toCharArray();
		for(int i =0;i<twochar.length;i++){
			for(int j =0;j<onechar.length;j++){
				if(onechar[j] == twochar[i]){
					
					k++;
				}	
			}
			if(k == one.length()){
				
				return true;
			}
			
		}
		
		
		return false;
	}
	public static void main(String [] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter String 1");
		String one = reader.next();
		Scanner reader2 = new Scanner(System.in);
		System.out.println("Enter String 2");
		String two = reader2.next();
		
		
		stringPermutation obj = new stringPermutation();
		boolean result = obj.permutation(one,two);
		
		System.out.println("first string is permutation of 2nd:"+result);
		
	}

}
