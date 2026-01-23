package streamseg;

import java.util.Arrays;
import java.util.List;

public class SumEven {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(3,5,7,8,10);
		
		int sum=list.stream()
				    .filter(n->n%2==0)
				    .reduce(0, (a,b)->a+b);
		
		System.out.println(sum);

	}

}
