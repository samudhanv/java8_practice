package in.eight.fi;

import java.util.function.Predicate;

public class PredicateDemo1 {
	
	public static void main(String[] args) {
		
		Predicate<String> validateLength = name -> name.length() > 6;
		
		boolean res1 = validateLength.test("Java");
		System.out.println("RES1= "+res1);
		
		boolean res2 = validateLength.test("Streams are powerful in Java");
		System.out.println("RES2= "+res2);
	}

}
