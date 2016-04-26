package dataStructures;

import java.util.Arrays;

public class LongestCommonPrefix {

	public String lngComPrefix(String [] strs){
		
		if(strs==null)return null;
		if(strs.length==0)return "";
		Arrays.sort(strs);
		char []first = strs[0].toCharArray();
		char []last = strs[strs.length-1].toCharArray();
		int i = 0;
		int len = Math.min(first.length, last.length);
		while(i<len && first[i]==last[i])i++;
		
		return strs[0].substring(0, i);
		
		
	}

}
