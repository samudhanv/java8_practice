package in.eight.demos;

import java.util.OptionalInt;
import java.util.stream.IntStream;

//without identity value at reduce method

public class Factorial_8_2 {
	
	public static void main(String[] args) {
		
		OptionalInt fact1 = IntStream.rangeClosed(1, 5)
					.reduce((a, b) -> a*b);
		
		OptionalInt fact2 = IntStream.rangeClosed(1, 0)
				.reduce((x, y) -> x*y);
		
		System.out.println("Factorial Value1= "+fact1);
		System.out.println("Factorial Value2= "+fact2);
	}

}
