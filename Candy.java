package dataStructures;

public class Candy {

	public Candy() {
		// TODO Auto-generated constructor stub
	}

	
	   static int distributeCandy(int[] ratings) {
		   if (ratings.length == 0) {
		        return 0;
		    }
		    int res = 1;
		    int pre = 1; // candies of previous
		    int j = 0; // start point of descending sequence
		    int preJ = 1; // candies of j
		    for (int i = 1; i < ratings.length; i++) {
		        if (ratings[i] == ratings[i - 1]) {
		            pre = 1;
		            j = i;
		            preJ = pre;
		        } else if (ratings[i] > ratings[i - 1]) {
		            pre++;
		            j = i;
		            preJ = pre;
		        } else {
		            res += i - j - 1;
		            if (i - j + 1 > preJ) { // if start point is large enough than all these descending, no need to add 1. otherwise add 1 to starting point
		                preJ = i - j + 1;
		                res++;
		            }
		            pre = 1;
		        }
		        res += pre;
		    }
		    return res;
	    }
	   
	   public static void main(String [] args){
		   
		   int [] arr = {2,4,2,6,1,7,8,9,2,1};
		   System.out.println(distributeCandy(arr));
	   }
}
