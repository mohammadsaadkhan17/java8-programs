package streamseg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortLists {

	// Sort a list of Integers in ascending and descending order using streams
	
	public static void main(String[] args) {
		
         List<Integer> list=Arrays.asList(45,3,4,7,56,4,21,12,67,77);
         
         List<Integer> asc=list.stream()
        		 .sorted(Comparator.naturalOrder())
        		 .collect(Collectors.toList());
         
         System.out.println("Sorted in Ascending Order"+asc);
         
         List<Integer> desc =list.stream()
        		 .sorted(Comparator.reverseOrder())
        		 .collect(Collectors.toList());
         System.out.println("Sorted in Descending Order"+desc);
	}

}
