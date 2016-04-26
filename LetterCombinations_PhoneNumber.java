package dataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations_PhoneNumber {


		
		static Map<Character,String> map;

		static{
		    
		    map = new HashMap<Character, String>();
		    map.put('2',"abc");
		    map.put('3',"def");
		    map.put('4',"ghi");
		    map.put('5',"jkl");
		    map.put('6',"mno");
		    map.put('7',"pqrs");
		    map.put('8',"tuv");
		    map.put('9',"wxyz");
		    
		}
		
		public List<String> letterCombinations(String digits) {
		    
		    List<String> list = new ArrayList<String>();
		    
		    if(digits.length()==0)return list;
		    list.add("");
		    for(int i=0;i<digits.length();i++){
		        
		        char c = digits.charAt(i);
		        
		        if(!map.containsKey(c))return new ArrayList<String>();
		        List<String> temp = new ArrayList<String>();
		        
		        String str = map.get(c);
		        char [] charArray = str.toCharArray();
		        for(String res:list){
		            for(char charIter:charArray){
		                temp.add(res+charIter);   
		            }
		        }
		        list = temp;
		    }

		    return list;
		}
		}


