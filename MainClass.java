package concepts;

import java.util.Arrays;

public class MainClass {


	public static void main(String [] args){
		
		Subclass sb = new Subclass("nagi",27);
		DynamicBinding db = new Subclass("hari",27);
		Subclass sb1 = (Subclass) new DynamicBinding("mani",28);
		Arrays.toString(new int[4]);
	}

}
