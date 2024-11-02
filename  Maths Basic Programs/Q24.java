class Q24{
    public static void main(String[] args) {
        double l1,l2,b1,b2,h1,h2,brick_v,wall_V;
        l1=25;
        b1=10;
        h1=7.5;
        l2=20;
        b2=2;
        h2=0.75;
        brick_v=l1*b1*h1;
        brick_v=brick_v/100;
        wall_V=l2*b2*h2;
     double cost=((wall_V/brick_v)*9000);
     System.out.println("Total cost="+cost);
    }
}