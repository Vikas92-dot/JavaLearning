

public class EmployeeMain {
	public static void main(String args[]) {
		Employee err[] = new Employee[3];
		
		err[0]=new Employee();
		err[1]=new Manager();
		err[2]=new Developer();
				
		err[0].calculateSalary();
		err[1].calculateSalary();
		err[2].calculateSalary();
	}
}
