package streamseg;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {

          String str= "swiss";
          
          Map.Entry<Character, Long> firstNonRepeatChar=
        		  str.chars().mapToObj(c -> (char) c)
          .collect(Collectors
          .groupingBy(Function.identity(), LinkedHashMap:: new, Collectors.counting()))
          .entrySet()
          .stream()
          .filter(e -> e.getValue()==1)
          .findFirst()
          .orElse(null);
          
          System.out.println(firstNonRepeatChar);

	}

}
