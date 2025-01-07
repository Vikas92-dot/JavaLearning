import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

class InvalidAgeForDrivingLicenseException  extends RuntimeException {
    InvalidAgeForDrivingLicenseException (String msg){
            super(msg);
        }
}
class InvalidMarkForDrivingLicenseException  extends RuntimeException {
    InvalidMarkForDrivingLicenseException (String msg){
        super(msg);
    }
}
public class DrivingLicence {
    private String name;
    private int userAge;
    private int mark;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter marks:");
        int marks = Integer.parseInt(sc.nextLine());

        try{
            if (age < 18 && age > 0) {
                throw new InvalidAgeForDrivingLicenseException("Age should be more than 18 years old");
            }
            if (age < 0) {
                throw new InvalidAgeForDrivingLicenseException("Invalid age");
            }
            if (marks < 80 && marks > 0) {
                throw new InvalidMarkForDrivingLicenseException("Mark should be more than 80");
            }
            if (marks > 100 || marks < 0) {
                throw new InvalidMarkForDrivingLicenseException("Invalid mark");
            }
            System.out.println("Approved");
        }
        catch(InvalidAgeForDrivingLicenseException e){
            System.out.println(e);
        }
        catch(InvalidMarkForDrivingLicenseException a){
            System.out.println(a);
        }
    }
}
