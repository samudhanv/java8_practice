package in.eight.fi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo2 {

    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 5, 9, 8, 13);
        List<Integer> numbers2 = Arrays.asList(11, 52, 45, 96, 84, 136);
        List<Integer> numbers3 = Arrays.asList(11, 5, 45,85);
        

        // Predicate to check if list has at least 2 even numbers
		
		  Predicate<List<Integer>> hasTwoEvens1 = list -> list
				  										   .stream()
				  										   .filter(n -> n%2==0)
				  										   .count() >=2 ;
		  
		  //Calling the method
		  System.out.println("Result 1= "+hasTwoEvens1.test(numbers1));
		  System.out.println("Result 2= "+hasTwoEvens1.test(numbers2));
		  System.out.println("Result 2= "+hasTwoEvens1.test(numbers3));
		 
                    
                          
    }
}

