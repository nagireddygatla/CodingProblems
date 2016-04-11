package dataStructures;

import java.util.HashSet;

public class WordPattern {     
public boolean wordPattern(String pattern, String str) {
    char [] carray = pattern.toCharArray();         
    String [] sarray = str.split(" ");        
    if(carray.length==0 || sarray.length==0) return false;        
    if(carray.length!=sarray.length) return false;         
    HashSet<Character> charset = new HashSet<Character>();        
    HashSet<String> strset = new HashSet<String>();         
    for(int i = 0;i<carray.length;i++){                         
    if(charset.add(carray[i]) != strset.add(sarray[i])){                
    return false;             
    }                       
    }         
    return true;    
    } 
    }
