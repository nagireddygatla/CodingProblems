package dataStructures;


/*You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend 
to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in 
said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the 
secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually 
derive the secret number.

For example:

Secret number:  "1807"
Friend's guess: "7810"
Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls 
and B to indicate the cows. In the above example, your function should return "1A3B".
*/
public class BullsCows {

	 public String getHint(String secret, String guess) {
		 int cows = 0;
		 int bulls=0;
	    int [] secArray = new int [10];
	    int [] guessArray = new int [10];
	    
	    for(int i = 0;i<secret.length();i++){
	    	
	    	if(secret.charAt(i)==guess.charAt(i)){
	    		bulls++;
	    	}
	    	
	    	else{
	    		
	    		secArray[secret.charAt(i)-'0']++;
	    		guessArray[guess.charAt(i)-'0']++;
	    		//System.out.println(secret.charAt(i)-'0');
	    		//System.out.println(guess.charAt(i)-'0');
	    		
	    	}
	    	
	    }
		for(int i1 = 0;i1<secArray.length;i1++){
    		System.out.println(i1);
    		cows=cows+ Math.min(secArray[i1], guessArray[i1]);
    		//System.out.println(cows);
    		
    	}
		
		 System.out.println(bulls+"A"+cows+"B");
		 return bulls+"A"+cows+"B";
	    }
	
	public static void main(String [] args){
		
		String secret = "1807";
		String guess = "7810";
		BullsCows obj = new BullsCows();
		obj.getHint(secret, guess);
		
	}

}
