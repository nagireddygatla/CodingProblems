package dataStructures;

public class LongestSubstringWithoutRepeat {

public static int lengthOfLongestSubstring(String s) {
        
        if(s.length()==0 || s==null)return 0;
        
        int [] position = new int[128];
        
        for(int i=0;i<128;i++){
            position[i] = -1;
            
        }
        
        char [] charArray = s.toCharArray();
       int max = 0;
       int index = 0;
       
       for(int j=0;j<charArray.length;j++){
           
           int p = position[charArray[j]];
           if(p>=index){
               max = Math.max(max,j-index);
               //System.out.println(max);
               index = p+1;
           }
           position[charArray[j]] = j;
       }
       max = Math.max(max,charArray.length-index);
        return max;
    }
	 
	 public static void main(String args []){
		 
		 String input = "abcabc";
		 
		 int res = lengthOfLongestSubstring(input);
		 System.out.println(res);
	 }

}
