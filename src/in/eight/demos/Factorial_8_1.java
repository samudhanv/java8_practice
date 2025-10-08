package in.eight.demos;

import java.util.stream.IntStream;

public class Factorial_8_1 {
	
	public static void main(String[] args) {
		
		int n = 7;
		
		/*
		 * int fact = IntStream.rangeClosed(1, n) .reduce(1, (a, b) -> a*b);
		 */
		
		int fact = IntStream.iterate(1, i->i+1)
					.limit(n)
					.reduce(1, (a, b) -> a*b);
		
		System.out.println("Factorial Result= "+fact);
	}

}
