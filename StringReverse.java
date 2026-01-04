package streamseg;

public class StringReverse {

	// Reverse a given String
	public static void main(String[] args) {
		
		String s ="Java";
		
		String reversed =new StringBuilder(s).reverse().toString();
		
		System.out.println(reversed);

	}

}
