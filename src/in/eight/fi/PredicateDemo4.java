package in.eight.fi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import in.eight.model.Employee;

public class PredicateDemo4 {

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
		
		Predicate<Employee> isDeveloper = emp -> emp.getDesignation().contains("Developer");
		boolean result1 = employees.stream().anyMatch(isDeveloper);
		System.out.println("Predicae Result1= "+ result1);		
		
		Predicate<Employee> hasSalaryBelow20K = e -> e.getSalary() < 20000;
		boolean result2 = employees.stream().anyMatch(hasSalaryBelow20K);
		System.out.println("Predicae Result2= "+ result2);
		
		Predicate<Employee> nameStartsWithB = e -> e.getName().startsWith("B");
		boolean result3 = employees.stream().anyMatch(nameStartsWithB);
		System.out.println("Predicae Result3= "+ result3);	
       

	}

}
