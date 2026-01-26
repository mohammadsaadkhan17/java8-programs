package streamseg;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSet {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(1,2,3,4,5,6,2,4,5);
		
		Set<Integer> set =list.stream().collect(Collectors.toSet());
		
		System.out.println(set);

	}

}
