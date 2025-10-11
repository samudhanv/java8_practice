package in.eight.fi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaDemo3 {
	
	public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Kiran");
        
        System.out.println("Before Lambda= "+names);

        Consumer<String> consumer = name -> {
        	
        	// Not Allowed: reassigning names list not allowed, if you uncomment below line
        	//names = new ArrayList<>(); 
        	
            // Allowed: modify contents of list
            names.add("Vishnu");
            names.add(name);
        };
        
        consumer.accept("Narayana");  //

        System.out.println("After Lambda= "+names);
    }

}
