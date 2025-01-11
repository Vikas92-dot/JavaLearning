import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class Employee{
    private String employeeName;
    private int employeeId;
    private String employeeDepartment;
    public Employee() {
    }
    public Employee(String employeeName, int employeeId, String employeeDepartment) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeDepartment = employeeDepartment;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeDepartment() {
        return employeeDepartment;
    }
    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }
    @Override
    public String toString() {
        return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeDepartment="
                + employeeDepartment + "]";
    }
    
}
public class Que9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of objects");
        int size = Integer.parseInt(sc.nextLine());

        ArrayList<Employee> al = new ArrayList<Employee>(size);
        Employee employee;

        for(int i=0; i<size; i++){
            System.out.println("Enter name of Employee:");
            String name = sc.nextLine();
            System.out.println("Enter ID of Employee:");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Enter Department of Employee:");
            String dep = sc.nextLine();

            employee = new Employee(name,id,dep);
            al.add(employee);
        }
        
        ListIterator itr = al.listIterator();

        System.out.println("List of Employees:");
        while (itr.hasNext()) {
        Employee pro = (Employee)itr.next();
        System.out.println(pro);
    }
}
}
