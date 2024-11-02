class Q21{
public static void main(String[] args) {
    int l1=15;
    int b1=8;
    int h1=5;
    int l2=15;
    int b2=10;
    int h2=8;
    int brick_v=l1*b1*h1;
    brick_v=brick_v/100;
    int wall_v=l2*b2*h2;
    int bricks_used=(wall_v/brick_v);
    System.out.println("Bricks used="+bricks_used);
}
}