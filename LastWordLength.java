package dataStructures;


public class LastWordLength{
	
	public int lengthOfLastWord(String s) {
        if(s==null || s.trim().length()==0)return 0;
        s= s.trim();
        String lastWord = s.substring(s.lastIndexOf(" ")+1);
        return lastWord.length();
    }
}