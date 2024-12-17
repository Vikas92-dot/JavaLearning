package Exception_Handling;

public class Throws {
    public void validateAge(int age)throws Exception{
        if (age<18) {
            System.out.println("Age must be 18 or older...");
            throw new IllegalArgumentException("Age must be 18 or older ");
        }
        System.out.println("Age is valid :"+age);
    }
    public static void main(String[] args) {
        Throws obj = new Throws();
        try {
            obj.validateAge(15);
        } catch (Exception e) {
            System.out.println("Age validation passed..");
        }
    }
}
