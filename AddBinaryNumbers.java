package dataStructures;

public class AddBinaryNumbers {

	static String addBinary(String first, String second){
		
		int firLength = first.length();
		int secLength = second.length();
		if(firLength > secLength){
			int addlength = firLength - secLength;
			for(int i=0;i<addlength;i++){	
				second = "0" + second;
			}
		}
		if(firLength < secLength){
			int addlength =  secLength-firLength;
			for(int i=0;i<addlength;i++){	
				first = "0" + first;
			}
		}
		
		int firstLength = first.length();
		String finals = "";
		int carry = 0;
		int add;
		for(int i =firstLength-1;i>=0;i--){
			add = Integer.parseInt(first.substring(i,i+1)) + Integer.parseInt(second.substring(i,i+1))+carry;
			//System.out.println(add);
			if(add==0){finals = "0" + finals;carry=0;}
			if(add==1){finals = "1" + finals;carry=0;}
			if(add==2){finals = "0" + finals;carry=1;}
			if(add==3){finals = "1" + finals;carry=1;}
			//System.out.println(add);
		}
		//System.out.println(carry);
		if(carry == 1)finals="1" + finals;
		
		return finals;
	}
	
	public static void main(String [] args){

		String firstBinay = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String secondBinary = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		String result = addBinary(firstBinay,secondBinary);
		System.out.println(result);
	}

}