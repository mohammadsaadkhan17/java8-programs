package streamseg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumProduct {

	public static void main(String[] args) {
		
		List<Integer> myList =Arrays.asList(3,5,7,8,10,4);
		
		int mySum=myList.stream()
				        .reduce(0,(a,b)->a+b);

		System.out.println("Sum="+mySum);
		
		
		int myProduct =myList.stream()
				             .reduce(1, (a,b)->a*b);
		
		System.out.println("Product="+myProduct);
		
	}

}
