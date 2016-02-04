package dataStructures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public int maxProduct(String [] words){
			List<Integer> product = new ArrayList<Integer>();
		for(int j = 0; j<words.length; j++){
			//String temp = words[j];
			char [] charsplit = words[j].toCharArray();
			for(int k = j+1;k<words.length;k++){	
				int p = 0;
				//String compWord = words[k];
				char [] charComp = words[k].toCharArray();
				for(int m = 0;m<charsplit.length;m++){
					for(int y = 0;y<charComp.length;y++){
					if(charsplit[m] == charComp[y]){
						p++;
					}
					}
				}
				if(p==0){
					
					product.add(charsplit.length * charComp.length);
				}
			}
		}
		if(product.size()>0){
			
			int max = Collections.max(product);
			return max;

		}

		return 0;
	}

	@SuppressWarnings("resource")
	public static void main(String []  args){
		Long time = System.currentTimeMillis();
		Scanner in = new Scanner(System.in);


		//finding the&nbsp;length of the Array studentNames
		System.out.print("how many students?:");
		int totalStudents =Integer.parseInt(in.nextLine()); 
		String[] studentNames = new String [totalStudents];

		//allows user to input student names

		for(int j = 0;j < studentNames.length;j++) 
		{
			System.out.println(j);
			System.out.print("enter student names:");
			studentNames[j] = in.nextLine();
		}

		Solution objs = new Solution();
		int result = objs.maxProduct(studentNames);
		System.out.println("the max product of the non matching strings:"+result);
		Long finals = System.currentTimeMillis() - time;
		System.out.println("Final Time:"+finals);
	}
}
