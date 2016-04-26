package dataStructures;

import java.util.Stack;

class StackMinimum extends Stack<Integer> {
    
    static Stack<Integer> s2 = new Stack<Integer>();;
    

    
    public void push(int x) {
    	
        super.push(x);
        if(s2.isEmpty()){
        s2.push(x);
        return;
        }
        
        if(x<getMin()){
            s2.push(x);
        }
        
    
    }

    public Integer pop() {
        if(super.isEmpty())return 0;
        int value = super.pop();
        if(value == getMin()){
            
            s2.pop();
        }
        return value;
        
        
    }

    public int top() {
    	int res = super.peek();
        if(!super.isEmpty())
        return res;
		return -1;
    }

    public int getMin() {
        if(s2==null){
            return -1;
        }
        else{   
            return s2.peek();
        }
    }
    
    public static void main(String [] args){
    	
    	StackMinimum obj = new StackMinimum();
    	obj.push(5);
    	obj.push(2);
    	obj.push(4);
    	obj.push(8);
    	obj.pop();
    	System.out.println(obj.top());
    	System.out.println(obj.getMin());
    	
    	
    }

}

