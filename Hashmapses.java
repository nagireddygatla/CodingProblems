package dataStructures;

import java.util.HashMap;
import java.util.List;


//just creates a hash map of type (integer,string) and add elements to it and prints them
public class Hashmapses {
	
	String []student = {"nagi","reddy","gatla"};
	
	
	public HashMap<Integer,String> hasmaps(){
		HashMap<Integer,String> example = new HashMap<Integer, String>();
		int i  = 0;
		for (String s:student){
			example.put(i,s);
			i++;	
		}
		return example;
	}
	
	public static void main(String[] args){
		Hashmapses obj = new Hashmapses();
		HashMap<Integer,String> returns = obj.hasmaps();
		for(int i =0;i<returns.size();i++){
		System.out.println(returns.get(i));
		}
	}	
}
