package streamseg;

import java.util.Arrays;
import java.util.List;

public class SumAndAvg {
	
    //Calculate the sum and average of a list of numbers
	public static void main(String[] args) {

		List<Integer> numbers =Arrays.asList(1,2,3,4,5);
		
		int sum = numbers.stream()
		               .mapToInt(Integer::intValue)
		               .sum();
		
		       System.out.println(sum);
		
		double avg = numbers.stream()
				          .mapToInt(Integer::intValue)
		                  .average()
		                  .orElse(0);
		
		       System.out.println(avg);
		
		
	}
}