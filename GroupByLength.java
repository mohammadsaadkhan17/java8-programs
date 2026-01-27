package streamseg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

	//Group a list of words by their length using Streams
	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("apple","bat","ball","cat","banana","dog","goat","A");

		
		Map<Integer,List<String>> output=words.stream().collect(Collectors.groupingBy(s->s.length()));
		//OR
		System.out.println("ONE:"+output);
		Map<Integer,List<String>> outputTwo=words.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println("TWO:"+outputTwo);
	}

}
