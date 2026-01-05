package streamseg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfList {

	//Flatten the List of List(list of list into Single List)
	public static void main(String[] args) {
		
		List<List<Integer>> listOfList =Arrays.asList(
				Arrays.asList(2,3,4,5),
				Arrays.asList(6,7,8,9),
				Arrays.asList(10,11,12)
				);
		
		//We want to convert them into Single list
		
		List<Integer> flattenList =listOfList.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		System.out.println(flattenList);

	}

}
