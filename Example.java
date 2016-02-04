package dataStructures;
	public class Example {

	static int temp=0;
	public static int countX(String str){
		
		if(str.length()<1) return temp;
		if(str.charAt(0)=='x')temp = temp+1;
		countX(str.substring(1));
		return temp;
		
	}
	
	public static void main(String [] args){
		String n = "hjhj";
		//int k = n%2==0?3:2;
		System.out.println(countX(n));
		
	}

}
