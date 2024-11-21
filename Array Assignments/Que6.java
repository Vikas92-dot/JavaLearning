//How can a Java string be converted into a byte array?.
class Que6{
public static void main(String[] args) {
    String s="ABCDE";
    byte []bytes=s.getBytes();

    // for(byte a: bytes){
    //     System.out.println(a);
    // }
    for(int i=0; i<bytes.length; i++){
        System.out.println(bytes[i]);
    }
}
}