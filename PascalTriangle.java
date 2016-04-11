package dataStructures;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows==0)return result;
        List<Integer> first = new ArrayList<Integer>();
        first.add(1);
        result.add(first);
        int initial = 0;
        int temp = 0;
        for(int i =1;i<numRows;i++){
            List<Integer> second = new ArrayList<Integer>();
            
            for(int list:first){
                temp = list;
                list = list + initial;    
                second.add(list);
                initial = temp;
            }
            second.add(1);
            result.add(second);
            first = second;
            initial = 0;
        }
        
        return result;
    }
}