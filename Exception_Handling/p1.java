package Exception_Handling;

class YoungerAgeException extends RuntimeException{
        YoungerAgeException(String msg){
            super(msg);
        }
}
class p1 {
    public static void main(String[] args) {
        int age = 16;
        if (age < 18) {
            throw new YoungerAgeException("You are not eligible to vote");
        }
        else{
            System.out.println("Vote Successfully done");
        }
    }
}
