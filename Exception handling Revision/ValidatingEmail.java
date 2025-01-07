import java.util.Scanner;

class DotException extends RuntimeException{
    DotException(String msg){
        super(msg);
    }
}
class AtTheRateException extends RuntimeException{
    AtTheRateException(String msg){
        super(msg);
    }
}
class DomainException extends RuntimeException{
    DomainException(String msg){
        super(msg);
    }
}
public class ValidatingEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email address.");
        String str = sc.next();
        char ch[] = str.toCharArray();

        int dotCount=0,atCount=0,domainCount=0;
        for(int i=0; i<ch.length; i++){
            if (ch[i] == '.') {
                dotCount++;
            }
            else if (ch[i] == '@') {
                atCount++;
            }
        }
        if (str.endsWith("in") || str.endsWith("com") || str.endsWith("net") || str.endsWith("biz") ) {
            domainCount++;
        }
        
        if (dotCount != 1) {
            throw new DotException("Invalid Dot usage");
        }
        if (atCount != 1) {
            throw new AtTheRateException("Invalid @ usage");
        }
        if (domainCount != 1) {
            throw new DomainException("Invalid Domain");
        }
        if (dotCount == 1 && atCount == 1 && domainCount == 1) {
            System.out.println("Valid email address");
        }
    }
}
