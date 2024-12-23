import java.util.Scanner;

public class Employee {
    private int empId;
    private float salary;

    
    public Employee() {
    }


    public Employee(int empId, float salary) {
        this.empId = empId;
        this.salary = salary;
    }


    public int getEmpId() {
        return empId;
    }


    public void setEmpId(int empId) {
        this.empId = empId;
    }


    public float getSalary() {
        return salary;
    }


    public void setSalary(float salary) {
        this.salary = salary;
    }
    
}
class EmployeeLevel extends Employee{

    public EmployeeLevel(int empId, float salary){
        super(empId, salary);
    }

    public int checkLevel(){
        if (getSalary() > 100) {
            return 1;
        }
        else
        return 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter empId and salary separated by a space:");
        String input = sc.nextLine();
        String parts [] = input.split(" ");

        

        if (parts.length != 2) {
            System.out.println("Invalid input ,please enter empid and salary seperated by space..");
            return;
        }
        else{
            int employeeId = Integer.parseInt(parts[0]);
            float empSalary = Float.parseFloat(parts[1]);

            EmployeeLevel obj = new EmployeeLevel(employeeId,empSalary);

            System.out.println("Emp Id: "+employeeId+"\nSalary: "+empSalary+"\nLevel: "+obj.checkLevel());
        }
            

    }
}
