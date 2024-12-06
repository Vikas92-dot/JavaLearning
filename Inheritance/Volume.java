package Inheritance;
public class Volume extends Area {
    private int h;

    // public setData(int l,int w,int h){
    //     setData(l, w);
    //     this.h = h;
    // }
    public Volume(){
        super(0,0);
    }
    public Volume(int l,int w,int h){
        super(l, w);
        this.h = h;
    }
    
    public int getVolume(){
        return getArea()*h;
    }

    public static void main(String[] args) {
        Volume obj1 = new Volume(10,20,30);
        // obj1.setData(10,20,30);
        System.out.println("Area: "+obj1.getArea());
        System.out.println("Volume: "+obj1.getVolume());
    }
}
