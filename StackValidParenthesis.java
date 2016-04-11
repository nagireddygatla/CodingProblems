package dataStructures;
import java.util.*;
/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.*/
public class StackValidParenthesis {

	public boolean isValid(String s){
		
		Stack<Character> store = new Stack<Character>();
		for(int i=0;i<s.length();i++){
			char initial = s.charAt(i);
//			/System.out.println(initial);
			if(initial=='(' || initial=='{' || initial=='[')store.push(initial);
			else{
			if(store.isEmpty())return false;
			char initialPeek = store.peek();
			if(initial==')' && initialPeek != '(')return false;
			if(initial=='}' && initialPeek != '{')return false;
			if(initial==']' && initialPeek != '[')return false;
			store.pop();
				
			}
		}
		return store.isEmpty();
	}
	
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string to check valid parenthesis:");
		String input = in.next();
		System.out.println(new StackValidParenthesis().isValid(input));
		in.close();
		
	}
	
	
}
