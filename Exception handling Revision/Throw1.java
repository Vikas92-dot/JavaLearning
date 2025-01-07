public class Throw1 {
    public static void main(String[] args) {
        System.out.println("main start");
        try {
            throw new NumberFormatException("Wrong input");
        } catch (Exception e) {
            System.out.println("problem");
        }
    }
}
