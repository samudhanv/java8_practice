package in.eight.fi;

public class LambdaDemo2 {

	public static void main(String[] args) {
		
		int num = 5;
		
		Progression finalCheck = (a) -> {
			
			//Captured local variable must be effectively final that's why if you uncomment below statement will get error.
			
			//num++;
			
			int val = a+num; // here just using 'num' not modifying it.
			
			return val;
		};
		
		System.out.println(finalCheck.calculate(10));
		
	}

}
