package streamseg;

import java.util.Arrays;
import java.util.List;

public class CheckDivisible {

	//Check if any number is divisible by 3
	public static void main(String[] args) {
		
		List<Integer> number =Arrays.asList(12,54,34,57,87,98,48);
		
		
		boolean checkDivisible =number.stream()
				                      .anyMatch(n -> n%3 ==0);

		System.out.println(checkDivisible);
		
		

	}

}
