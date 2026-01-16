package streamseg;

import java.util.Arrays;
import java.util.List;

public class CountString {

	public static void main(String[] args) {
		
		List<String> list =Arrays.asList("david","alice","john","sam");
		
		long result =list.stream()
				         .filter(n -> n.length()>4)
				         .count();
		
		System.out.println(result);

	}

}
