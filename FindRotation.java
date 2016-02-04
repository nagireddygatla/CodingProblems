package dataStructures;

public class FindRotation {

	public static boolean subStringCheck(String one, String two){
		
		boolean result =false;
		if(one.length() == two.length() && one.length() > 0){
			
			String check = one + one;
			result = isSubString(two,check);
			return result;
		}
		return result;
	}
	static boolean isSubString(String one, String check){
		//int lengthsub = one.length();
		System.out.println(check);
		int lengthtotal = check.length();
		for(int i = 0;i<lengthtotal;i++){
			for(int j = i+1;j<lengthtotal;j++)
			{
				String sub = check.substring(i, j);
				System.out.println(sub);
				if(sub.equals(one)){
					return true;
				}
				
			}
		}		
		return false;
	}
	
	
	
	public static void main(String [] args){
		
		String one = "waterbottle";
		String two = "erbottlewat";
		boolean result = subStringCheck(one, two);
		System.out.println("String 1 is rotation of string 2:"+result);
	}
	
	

}
