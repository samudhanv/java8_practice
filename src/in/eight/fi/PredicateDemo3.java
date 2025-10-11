package in.eight.fi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import in.eight.model.Employee;

public class PredicateDemo3 {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
                new Employee("Raghu", 42, "Male", "TechManager", 175000),
                new Employee("Vydehi", 40, "Female", "HRManager", 169000),
                new Employee("Chandra", 34, "Male", "Sr.Developer", 78000),
                new Employee("Tanuja", 30, "Female", "Tester", 45000),
                new Employee("Eswar", 32, "Male", "Developer", 55000),
                new Employee("Miduna", 25, "Female", "Trainee", 21000),
                new Employee("Jnanand", 36, "Male", "Lead", 125000),
                new Employee("Nandhu", 26, "Male", "Trainee", 21500),
                new Employee("Aruna", 35, "Female", "Lead", 124000)
                );
		
		Predicate<List<Employee>> isDeveloper = list -> list.stream()
															.anyMatch(emp -> emp.getDesignation().contains("Developer"));
		
		Predicate<List<Employee>> hasSalaryAbove75K = list -> list.stream()
															 .filter(e -> e.getSalary()>75000)
															 .count() > 0;
															 
		Predicate<List<Employee>> hasAgeAbove52 = list -> list.stream()
															  .anyMatch(emp -> emp.getAge()>52);
															
																 
		
		System.out.println("Result1= "+isDeveloper.test(employees));
		System.out.println("Result2= "+hasSalaryAbove75K.test(employees));
		System.out.println("Result3= "+hasAgeAbove52.test(employees));
		
        /*
         * Predicates are meant to apply to single elements, not collections.
         * We can use Predicate<List<Employee>> but, Java 8’s functional style encourages:
         * 1. Applying a predicate to each element (e.g., Predicate<Employee>)
         * 2. Then combining it with stream operations (anyMatch, filter, etc.)
         * Refer PredicateDemo4 
         */
       

	}

}
