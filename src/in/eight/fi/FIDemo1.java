package in.eight.fi;

//Functional Interface implementation through classes

class Square implements Progression{

	@Override
	public int calculate(int val) {
		
		return val*val;
	}
	
}


class Cube implements Progression{

	@Override
	public int calculate(int val) {
		
		return val*val*val;
	}
	
}


class Factorial implements Progression{

	@Override
	public int calculate(int val) {
		
		int res = 1;
		
		for(int i=1; i<=val; i++)
			res*=i;
		
		return res;
	}
	
}


public class FIDemo1 {

	public static void main(String[] args) {
		
		Square s = new Square();
		System.out.println("Square Result= "+s.calculate(4));	
		
		
		System.out.println("Cube Result= "+new Cube().calculate(5));
		System.out.println("Factorial Result= "+new Factorial().calculate(5));

	}

}
