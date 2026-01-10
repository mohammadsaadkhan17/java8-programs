package streamseg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(34,54,65,76,89,66,78,88,99);
		
		List<Integer> result=numbers.stream()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.limit(3)
		.collect(Collectors.toList());
		
		System.out.println(result);

	}

}
