package streamseg;

import java.util.Arrays;
import java.util.List;

public class AllPositiveNumbers {

	// Check if all the Elements are Positive Numbers.
	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(2,4,7,6,8,1,2,4,9);
		
		boolean match=numbers.stream()
		.allMatch(n -> n>0); // This will match your condition with every element inside this particular List, if this condition fails for any element then it will return you false
        
		System.out.println(match);
		
	}

}
