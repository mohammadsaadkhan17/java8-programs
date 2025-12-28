package streamseg;

import java.util.stream.IntStream;

public class PrintSeries {

	public static void main(String[] args) {
		
		IntStream.of(11, 12, 15, 20, 27)
		.forEach(i -> System.out.print(i+" "));
		
		System.out.println();
		
		IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9 ,10)
		.forEach(System.out::println);

	}

}
