package in.eight.demos;

import java.util.stream.IntStream;

public class PrimeNumbers_8_1 {

	public static void main(String[] args) {
		int n=79;
		
		long fact = IntStream.rangeClosed(1, n)
					.filter(i -> n%i==0)
					.count();
		
		if(fact>2)
			System.out.println("Composite");
		else
			System.out.println("Prime");
	}
}
