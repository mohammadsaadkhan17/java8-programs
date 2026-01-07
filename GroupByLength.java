package streamseg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

	//Group a list of words by their length using Streams
	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("apple","orange","mango","grapes","banana");

		Map<Integer,List<String>> groupBy=words.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(groupBy);
	}

}

