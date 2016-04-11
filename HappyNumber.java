package dataStructures;

import java.util.HashSet;

public class HappyNumber {
    
    HashSet<Integer> ref = new HashSet<Integer>();
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        else{
            int sum = 0;
            int pres = 0;
            while(n>0){
                pres = n%10;
                sum = sum + pres * pres;
                n = n/10;
            }
            if(!ref.contains(sum)){
                ref.add(sum);
               
                return isHappy(sum);
            }
            else{
                return false;
            }
        }
    }
}
