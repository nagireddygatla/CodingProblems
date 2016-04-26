package dataStructures;
import java.util.*;


public class WordLadder {
	
	
	public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
	   
		Queue<String> queue = new LinkedList<String>();
		Set<String> visited = new HashSet<String>();
		
		queue.offer(beginWord);
		visited.add(beginWord);
		int length = 1;
		
		while(!queue.isEmpty()){
			int count = queue.size();
			
			for(int i = 0; i<count;i++){
				System.out.println(queue.peek());
				char [] chrs = queue.poll().toCharArray();
				for(int j=0;j<chrs.length;j++){
					for(char chr = 'a';chr<='z';chr++){
						char charold = chrs[j];
						chrs[j] = chr;
						String tempWord = String.valueOf(chrs);
						if(tempWord.equals(endWord))return length+1;
						if(!visited.contains(tempWord) && wordList.contains(tempWord)){
							queue.offer(tempWord);
							visited.add(tempWord);
						}	
						chrs[j] = charold;
					}			
				}
			}
			length++;
		}
	    return 0;
	}
	
	public static void main(String [] args){
		WordLadder obj = new WordLadder();
		String beginWord = "hit";
		String endWord = "cog";
		Set<String> wordList = new HashSet<String>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
		int length = obj.ladderLength(beginWord, endWord, wordList);
		System.out.println(length);
		
		
	}

}
