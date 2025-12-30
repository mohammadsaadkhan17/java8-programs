package streamseg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberDivisibleBy {

	//List of numbers divisible by 3
	public static void main(String[] args) {
		
		List<Integer> numbers =Arrays.asList(3,4,5,6,7,8,77,66,54,32,12,9);
		
		List<Integer> divNo=numbers.stream()
				.filter(n-> n%3 ==0)
				.collect(Collectors.toList());
		
		System.out.println("List of numbers Divisible by 3 are:"+divNo);

	}
}
