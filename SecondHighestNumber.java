package streamseg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumber {

	//Find the Second highest number in a List using streams
	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(24,56,47,87,98,45);

		int number =list.stream()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		System.out.println(number);
	}

}
