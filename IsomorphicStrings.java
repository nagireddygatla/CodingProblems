package dataStructures;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length())return false;
       
        Map<Character,Character> smap = new HashMap<Character,Character>();
        Map<Character,Boolean> bmap = new HashMap<Character,Boolean>();
        
        for(int i=0;i<s.length();i++){
            
            if(smap.containsKey(s.charAt(i))){
                if(smap.get(s.charAt(i))!=t.charAt(i))return false;
            }
            else{
                if(bmap.containsKey(t.charAt(i)))return false;
                bmap.put(t.charAt(i),true);
                smap.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}