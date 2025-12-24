package streamseg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {

	// Join List of Strings into a single comma-separated
	public static void main(String[] args) {
		
		List<String> myList =Arrays.asList("Rahul", "Sonu", "Rohit", "Sohel", "Aman", "Ajay", "Sonu");

		String joinedString = myList.stream().collect(Collectors.joining("," , "[" , "]"));
		
		System.out.println(joinedString);
		
	}

}

