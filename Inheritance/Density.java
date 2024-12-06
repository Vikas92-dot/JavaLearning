package Inheritance;
public class Density extends Volume{
    private int mass;
    
    public Density(int l,int w,int h,int mass){
        super(l,w,h);
        this.mass = mass;
    }
    public int getDensity(){
        return getVolume()*mass;
    }
    public static void main(String[] args) {
        Density obj2 = new Density(10,20,30,40);
        System.out.println("Density: "+obj2.getDensity());
    }

}
