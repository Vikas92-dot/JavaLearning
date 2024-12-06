package Inheritance;
public class Area {
    private int l;
    private int w;

    // public void setData(int l,int w){
    //     this.l = l;
    //     this.w = w;
    // }
    public Area(){
        l=w=0;
    }
    public Area(int l,int w){
        this.l = l;
        this.w = w;
    }
    public int getArea(){
        return l*w;
    }

    public static void main(String[] args) {
        Area obj = new Area(10,20);
        // obj.setData(10,12);
        int res=obj.getArea();
        System.out.println("Area : "+res);
}
}