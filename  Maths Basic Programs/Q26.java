class Q26{
    public static void main(String[] args) {
        double l1,l2,b1,b2,brick_v,path_v;
        l1=120;
        b1=2.4;
        l2=24;
        b2=15;
        brick_v=l2*b2;
        brick_v=brick_v/100;
        path_v=l1*b1;
        double req=(path_v/brick_v);
        System.out.println("Required Bricks="+req);
    }

}