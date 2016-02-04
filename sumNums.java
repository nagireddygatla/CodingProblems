package dataStructures;

public class sumNums {
	
	public int add(int input){
		input = (int) (input - 9*(Math.floor((input-1)/9)));
		return input;
	}
	
	public static void main(String [] args){
		sumNums obj = new sumNums();
		 System.out.println(obj.add(15));
	}

}