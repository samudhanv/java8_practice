package in.eight.fi;


//Functional Interface implementation through Anonymous class
public class ACDemo1 {
    public static void main(String[] args) {
        
        // Anonymous class implementation
        Progression progression = new Progression() {
            @Override
            public int calculate(int val) {
                // Example logic: square the number
                return val * val;
            }
        };

        // Use it
        int result = progression.calculate(5);
        System.out.println("Result = " + result); // Output: Result = 25
    }
}

