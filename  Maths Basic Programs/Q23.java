class Q23{
    public static void main(String[] args) {
        int l,b,h,a,cartoon_v,cube_v;
        l=15;
        b=9;
        h=12;
        a=3;
        cartoon_v=l*b*h;
        cube_v=a*a*a;
        int no_of_cube=(cartoon_v/cube_v);
        System.out.println("Number of Coubical Boxes="+no_of_cube);
    }
}