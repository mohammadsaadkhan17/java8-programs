package streamseg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurence {

    //Count occurrences of each element in a List
	public static void main(String[] args) {
		
		List<String> items =Arrays.asList("apple","banana","ball","cat","banana","ball","apple");
		
		Map<String, Long> occurrence=items.stream()
				                          .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	    System.out.println(occurrence);
	}

}
