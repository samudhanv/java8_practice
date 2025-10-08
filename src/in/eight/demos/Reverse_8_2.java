package in.eight.demos;

import java.util.stream.IntStream;

public class Reverse_8_2 {
	
	public static void main(String[] args) {
		
		int num = 62785;
		int digicount = (int) Math.log10(num) + 1;  // calculates the number of digits in a given integer
		
		int reverse = IntStream.iterate(num,  n -> n/10)
				        .limit(digicount)
						.map(n -> n%10)
						.reduce(0, (rev, rem) -> rev*10+rem);
		
		System.out.println("Reverse Number= "+reverse);
	}

}
