package dataStructures;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


//Time complexity for recursive is O(n^2) and DP is O(n*d) n = size of string, d = size of dictionary
public class WordBreak {

	 public String breakWord(char[] str,int low,Set<String> dictionary){
	        StringBuffer buff = new StringBuffer();
	        System.out.println(low);
	        for(int i= low; i < str.length; i++){
	            buff.append(str[i]);
	            if(dictionary.contains(buff.toString())){
	                String result = breakWord(str, i+1, dictionary);
	                if(result != null){
	                    return buff.toString() + " " + result;
	                }
	            }
	        }
	        if(dictionary.contains(buff.toString())){
	            return buff.toString();
	        }
	        return null;
	    }
	 
	  public boolean wordBreakTopDownOneSolution(String s, Set<String> wordDict) {
	        Map<Integer, Boolean> dp = new HashMap<>();
	        int max = 0;
	        for (String s1 : wordDict) {
	            max = Math.max(max, s1.length());
	        }
	        //System.out.println(max);
	        boolean tep = wordBreakTopDownOneSolutionUtil(s, wordDict, 0, max, dp);
	        System.out.println(dp);
	        return tep;

	    }
	 String result = null;
	 private  boolean wordBreakTopDownOneSolutionUtil(String s, Set<String> dict, int start, int max, Map<Integer, Boolean> dp) {
	        if (start == s.length()) {
	        	return true;
	            
	        }

	        if (dp.containsKey(start)) {
	            return dp.get(start);
	        }

	        for (int i = start; i < start + max && i < s.length(); i++) {

	            String newWord = s.substring(start, i + 1);
	            if (!dict.contains(newWord)) {
	                continue;
	            }
	           
	          
	            if (wordBreakTopDownOneSolutionUtil(s, dict, i + 1, max, dp)) {

	  	            result = newWord + " ";
	  	            System.out.println(result);
	                dp.put(start, true);
	                return true;
	            }
	        }
	        dp.put(start, false);
	        return false;
	    }
	 
	 
	 public static void main(String [] args){
		 
		 WordBreak obj = new WordBreak();
		 char [] str = "aaaaaaa".toCharArray();
		 
		 int low = 0;
		 String strng = "tomorrowpeanutbuttercan";
		 Set<String> dictionary= new HashSet<String>();
		 dictionary.add("tomorrow");
		 dictionary.add("pea");
		 dictionary.add("peanut");
		 dictionary.add("butter");
		 dictionary.add("buttercan");
		 
		 new WordBreak().wordBreakTopDownOneSolution(strng,dictionary);
		 System.out.println(obj.breakWord(str, low, dictionary));
		 
		 
	 }

}
