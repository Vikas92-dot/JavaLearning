class Q5{
public static void main(String args[]){
float total_cost,l,rate_per,b,perimeter,area;
total_cost=1600;
l=20;
rate_per=25;
b=(total_cost/(rate_per*l));
perimeter=2*(l+b);
area=l*b;
System.out.println("Breadth="+b+"\nPerimeter="+perimeter+"\nArea="+area);
}
}