package streamseg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOf {

	//Calculate the Square of given numbers in a List
	public static void main(String[] args) {

           List<Integer> myList=Arrays.asList(2,3,6,7,8,9,10);
           
          List<Integer> squareOf=myList.stream()
        		                       .map(n->n*n)
        		                       .collect(Collectors.toList());
          
          System.out.println(squareOf);

	}

}
