package in.eight.demos;

import java.util.stream.IntStream;

public class OddNumbers_8_2 {

	public static void main(String[] args) {
		int n=30;
		IntStream.iterate(1, i -> i+2)
		.limit(n/2)  // It restricts only 5 even numbers to print
		.forEach(i -> System.out.print(i+" "));
	}
}
