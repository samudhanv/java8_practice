package in.eight.fi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import in.eight.model.Employee;

public class PredicateDemo5 {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
                new Employee("Raghu", 42, "Male", "TechManager", 175000),
                new Employee("Vydehi", 40, "Female", "HRManager", 169000),
                new Employee("Chandra", 34, "Male", "Sr.Developer", 78000),
                new Employee("Tanuja", 30, "Female", "Tester", 45000),
                new Employee("Udaya", 39, "Female", "Manager", 102000),
                new Employee("Eswar", 32, "Male", "Developer", 55000),
                new Employee("Miduna", 25, "Female", "Trainee", 21000),
                new Employee("Jnanand", 36, "Male", "Lead", 115000),
                new Employee("Nandhu", 26, "Male", "Trainee", 21500),
                new Employee("Aruna", 35, "Female", "Lead", 112000),
                new Employee("Sarath", 34, "Male", "Sr.Developer", 65000)
                );   
		
		Predicate<Employee> isFemale = emp -> emp.getGender().contains("Female");		
		//Predicate<Employee> isMale = emp -> emp.getGender().contains("Male");
		//Predicate<Employee> hasSalaryAbove60K = e -> e.getSalary() > 60000;
        Predicate<Employee> isDeveloper = e -> e.getDesignation().toLowerCase().contains("developer");
       // Predicate<Employee> isLead = e -> e.getDesignation().toLowerCase().contains("lead");
        Predicate<Employee> isManager = e -> e.getDesignation().toLowerCase().contains("manager");
        
        //Predicate<Employee> isMaleDeveloper = isMale.and(isDeveloper);
        Predicate<Employee> isFemaleDeveloper = isFemale.and(isDeveloper);
        Predicate<Employee> isNotDeveloperNotManager = isDeveloper.or(isManager).negate();
        
		
		  System.out.println("*****Female Developers:*****"); 
		  employees.stream()
		  .filter(isFemaleDeveloper) 
		  .forEach(e -> System.out.println(e.getName() + " - "
		  + e.getDesignation()));
		 
        
        
		
		  System.out.println("*****Employees:*****"); employees.stream()
		  .filter(isNotDeveloperNotManager) .forEach(e ->
		  System.out.println(e.getName() + " - " + e.getDesignation()));
		 
	}

}
