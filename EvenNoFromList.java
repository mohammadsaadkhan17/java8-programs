package streamseg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNoFromList {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2,4,5,6,7,8,9,20);

		List<Integer> evenNo =numbers.stream()
				.filter(n -> n% 2==0)
				.collect(Collectors.toList());

		System.out.println(evenNo);

	}

}
