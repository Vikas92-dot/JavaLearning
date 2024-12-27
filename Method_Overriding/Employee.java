

public class Employee {
	public void calculateSalary() {
		System.out.println("Base salary calculation for Employee.");
	}
	
}
class Manager extends Employee{
	public void calculateSalary() {
		System.out.println("add a bonus to base salary");
	}
}
class Developer extends Employee{
	public void calculateSalary() {
		System.out.println("Salary based on hours worked");
	}
}