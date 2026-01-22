import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class MergeArray {

	public static void main(String[] args) {
		int[] arr1 = {2,6,5,8,4};
		int[] arr2 = {3,7,1,9,0};
		
		int[] mergedArray =IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
			                        .sorted().toArray();
		
		System.out.println(Arrays.toString(mergedArray));
	}
}

