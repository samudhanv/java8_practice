package in.eight.model;

public class Employee {
    private String name;
    private int age;
    private String gender;
    private String designation;
    private double salary;

    // Constructor
    public Employee(String name, int age, String gender, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getDesignation() { return designation; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + age + ", " + gender + ", " + designation + ", " + salary + ")";
    }
}

