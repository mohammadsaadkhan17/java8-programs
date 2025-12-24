package streamseg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {

	// Join List of Strings into a single comma-separated
	public static void main(String[] args) {
		
		List<String> myList =Arrays.asList("Rahul", "Sonu", "Rohit", "Sohel", "Aman", "Ajay", "Sonu");

		String joined = myList.stream().collect(Collectors.joining("," , "[" , "]"));
		
		System.out.println(joined);
		
		String g=myList.stream().collect(Collectors.joining(","));
		
		System.out.println(g);

	}

}
