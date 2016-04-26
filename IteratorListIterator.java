package concepts;
import java.util.*;
import java.util.Map.Entry;
public class IteratorListIterator {

	
	public static void main(String args []){
		
		Map<String,String> exam = new HashMap<>();
		exam.put("1","nagi");
		exam.put("2","Hari");
		exam.put("3","Pavan");
		exam.put("4","Gavas");
		
		List<Entry> entryList = new ArrayList<Entry>(exam.entrySet());
		System.out.println("\n==> Size of Entry list: " + entryList.size());
		for (Entry temp : entryList) {
			String val = String.valueOf(temp.getValue());
			System.out.println(val);
			
		}
		
		/*Set<Entry<String, String>> entryset = exam.entrySet();
		Iterator iter = entryset.iterator();
		for(Map.Entry<String,String> entry:exam.entrySet()){
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}*/
		
	}

}
