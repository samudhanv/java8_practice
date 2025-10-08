package in.eight.demos;

import java.util.stream.IntStream;

public class Factors_8_2 {
	public static void main(String[] args) {
		int n=33;
		
		IntStream.iterate(1, i -> i+1)
		.limit(n)
		.filter(i -> n%i == 0)
		.forEach(i -> System.out.print(i+ "--"));
	}
}
