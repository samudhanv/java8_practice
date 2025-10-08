package in.eight.demos;

import java.util.stream.IntStream;

public class Reverse_8_1 {
	
	public static void main(String[] args) {
		
		int num = 56278;
		
		int reverse=IntStream.iterate(num, n -> n>0, n -> n/10) // this iterate is available from Java9+ onwards
		         			 .map(n -> n%10)
		         			 .reduce(0, (rev, rem) -> rev*10+rem);
		
		System.out.println("Reverse Number= "+reverse);
	}

}
