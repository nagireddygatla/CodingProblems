package dataStructures;
import java.util.*;

class TrieNode {
    // Initialize your data structure here.
        char c;
        boolean isExists;
        HashMap<Character,TrieNode> children = new HashMap<Character,TrieNode>();
        public TrieNode(char c){
            this.c = c;
        }
    public TrieNode() {
    	
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        Map<Character,TrieNode> children = root.children;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            TrieNode t;
            if(children.containsKey(c)){
                t = children.get(c);
            }else{
                t = new TrieNode(c);
                children.put(c,t);
            }
            
            children = t.children;
            
            if(i==word.length()-1){
                
                t.isExists = true;
            }
      
        }
               
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode t = searchWord(word);
        
        if(t.isExists==true && t!=null){
            return true;
        }
        else{
            
            return false;
            
        }
        
    }

    public TrieNode searchWord(String word){
        HashMap<Character,TrieNode> children = root.children;
        TrieNode t = null;
        for(int i = 0;i<word.length();i++){
            char c = word.charAt(i);
            
            if(children.containsKey(c)){
                t = children.get(c);
            }
            else{
                return null;
            }
            children = t.children;
        }
        
        
        return t;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode t = searchWord(prefix);
        if(t==null){
            return false;
        }
        else{
            return true;
        }
        
    }
    
    public static void main(String [] args){
    	
    	Trie obj = new Trie();
    	obj.insert("Nagi");
    	System.out.println(obj.search("Nagi"));
    	System.out.println(obj.startsWith("Na"));
    	
    }
    
}