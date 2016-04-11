package dataStructures;

public class CountAndSay {
    public String countAndSay(int n) {
        String str = "1";
        StringBuilder newstr = new StringBuilder();
        int strlen;
        char chr = str.charAt(0);
        char prevchar = str.charAt(0);
        int eachIter = 1;
        int j=1;
        for(int i =0;i<n-1;i++){
            strlen = str.length()-1;
            while(strlen>0){
                chr = str.charAt(j);
                if(chr!=prevchar){
                    newstr.append(eachIter).append(prevchar);
                    eachIter=0;
                }
                prevchar = chr;
                    eachIter++;
                    strlen--;
                    j++;
            }
            newstr.append(eachIter).append(prevchar);
            str = newstr.toString();
            newstr = new StringBuilder();
            j=1;
            prevchar = str.charAt(0);
            eachIter=1;
        }
      return str;
    }
}
