package in.eight.demos;

import java.util.stream.IntStream;

public class QubeSeries_8 {
	public static void main(String[] args) {
		int n=10;
		
		IntStream.rangeClosed(1, n)
		.forEach(i -> System.out.print((i*i*i)+ " "));
	}
}
