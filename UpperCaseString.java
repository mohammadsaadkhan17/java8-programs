package streamseg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseString {

	//Convert a list of String into uppercase 
	public static void main(String[] args) {
		
		List<String> list =Arrays.asList("alice", "john", "sam", "david");
		
		List<String> names=list.stream()
				               .map(n -> n.toUpperCase())
				               .collect(Collectors.toList());
		
		System.out.println(names);

	}

}
