package streamseg;

import java.util.Arrays;
import java.util.List;

public class FirstNonEmptyString {

	//Find the first non-empty String in a List
	public static void main(String[] args) {
		
		  List<String> strings =Arrays.asList("", "apple", "mango"," ", "orange");
		  
		  String name=strings.stream()
				             .filter(n-> !n.isEmpty())
				             .findFirst()
				             .get();
		  
		  System.out.println(name);
		 
	
	
	}

}
