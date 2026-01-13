package streamseg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {

	public static void main(String[] args) {
		
		List<String> fruits =Arrays.asList("apple","mango","banana","papaya","orange");
		
		Optional<String> longestString =fruits.stream()
				                              .max(Comparator.comparingInt(String::length));
		
		System.out.println(longestString);

	}

}
