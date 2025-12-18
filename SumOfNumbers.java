package streamseg;
 
import java.util.stream.IntStream;

public class SumOfNumbers {

    public static void main(String[] args) {
        // Using IntStream.rangeClosed to create a stream of integers from 1 to 10 (inclusive)
        int sum = IntStream.rangeClosed(1, 10)
                           .sum(); // The sum() method directly calculates the sum of elements in the stream

        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
    }
}