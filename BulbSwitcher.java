package dataStructures;
import java.util.Scanner;

/*There are n bulbs that are initially off. You first turn on all the bulbs. Then, you turn off every second bulb. 
 * On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). 
 * For the nth round, you only toggle the last bulb. Find how many bulbs are on after n rounds.

Example:

Given n = 3. 

At first, the three bulbs are [off, off, off].
After first round, the three bulbs are [on, on, on].
After second round, the three bulbs are [on, off, on].
After third round, the three bulbs are [on, off, off]. 

So you should return 1, because there is only one bulb is on.*/

//Easiest solution to bulb switcher is to return (int) Math.sqrt(n)
public class BulbSwitcher {
	
public int bulbSwitch(int n) {
	
        int [] arr = new int[n];
        //System.out.println(arr.length);
       for(int i = 0; i<arr.length;i++){
        arr[i] = 0;
       }
       
       int k =0;
       //arr[0]=1;
       while(k<arr.length){
    	   
    for(int i=k;i<arr.length;i=i+k+1){
    	
    	if(arr[i]==1){
    	arr[i] = 0;
    	}
    	else
    	{
    		arr[i] = 1;	
    	}
    	//System.out.println(arr[i]);
    }
    k=k+1;
       }
     int p=0;
       for(int i = 0;i<arr.length;i++){
    	   p=p+arr[i];
       }
	return p;
    }

	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input val:");
		int input = in.nextInt();
		BulbSwitcher obj = new BulbSwitcher();
		int res = obj.bulbSwitch(input);
		System.out.println(res);
	}

}
