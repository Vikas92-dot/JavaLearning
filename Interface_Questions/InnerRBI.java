interface RBI{
    void ROI();
    void KYC();
    default void addressrelated(){
        System.out.println("take default address");
    }
}
class SBI implements RBI{
    public void ROI(){
        System.out.println("SBI ROI");
    }
    public void KYC(){
        System.out.println("SBI KYC");
    }
    public void addressrelated(){
        System.out.println("SBI address verify");
    }
}
class ICICI implements RBI{
    public void ROI(){
        System.out.println("ICICI ROI");
    }
    public void KYC(){
        System.out.println("SBI KYC");
    }
}
public class InnerRBI{
    public static void main(String[] args) {
        RBI obj = new SBI();
        obj.KYC();
        obj.addressrelated();
    }
}