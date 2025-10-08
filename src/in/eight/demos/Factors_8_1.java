package in.eight.demos;

import java.util.stream.IntStream;

public class Factors_8_1 {
	public static void main(String[] args) {
		int n=24;
		
		IntStream.rangeClosed(1, n)
		.filter(i -> n%i == 0)
		.forEach(i -> System.out.print(i+ " "));
	}
}
