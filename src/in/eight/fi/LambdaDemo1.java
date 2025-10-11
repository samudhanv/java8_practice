package in.eight.fi;


import java.util.stream.IntStream;


//Functional Interface implementation through Lambdas
public class LambdaDemo1 {

	public static void main(String[] args) {
		
		
		// lambda expressions to define the calculate method
		Progression square = (s) -> s*s;
		Progression cube = (s) -> s*s*s;
		Progression fact = (s) -> IntStream.rangeClosed(1, s).reduce(1, (x, y) -> x*y);
		
		
		
		// calling the calculate method
		// parameter and return type should be same
		System.out.println("Square= "+square.calculate(6));
		System.out.println("Cube= "+cube.calculate(3));
		System.out.println("Factorial= "+fact.calculate(5));				
		
	}

}
