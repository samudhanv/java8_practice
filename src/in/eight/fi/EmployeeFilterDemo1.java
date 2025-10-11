package in.eight.fi;

import java.util.Arrays;
import java.util.List;
import in.eight.model.Employee;

public class EmployeeFilterDemo1 {

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
		
		
		employees.stream()
				 .filter(e -> e.getDesignation().contains("Developer") && e.getSalary()>45000)
				 .forEach(e -> System.out.println(e.getName()+ "****"+ e.getDesignation()+ "****"+ e.getSalary()));
		
			}
	
}
