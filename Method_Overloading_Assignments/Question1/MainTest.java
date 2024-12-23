import java.util.Scanner;


class MainTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give no. of Employee you want to enter data:");
        int size = sc.nextInt();
        
        Employee a[] = new Employee[size];
        
        for(int i=0; i<a.length; i++){
            System.out.print("Enter First Name :");
            String firstName = sc.next();
            System.out.print("Enter last Name :");
            String lastName = sc.next();
            System.out.print("Enter Employee Id :"); 
            int empId = sc.nextInt();
            System.out.print("Enter Job Title :");
            String jobTitle = sc.next();             
            a[i] = new Employee(firstName,lastName,empId,jobTitle);
        }
        for(int i=0; i<a.length; i++){

            System.out.println("Employee details:");
            System.out.println("Name: "+a[i].getFirstName()+" "+a[i].getLastName()+","+a[i].getJobTitle());
            System.out.println("Employee ID: "+a[i].getEmpId());
        }

    }
}
