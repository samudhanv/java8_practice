package in.eight.demos;

import java.util.stream.IntStream;

public class EvenNumbers_8_1 {

	public static void main(String[] args) {
		int n=10;
		
		IntStream.rangeClosed(1, n)
		.filter(i -> i%2 == 0)
		.forEach(i -> System.out.print(i+" "));
	}
}
