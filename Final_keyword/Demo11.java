abstract class A{
	// final int x;     //1. initialize while declare
	static final int a;	//1. initialize while declare
	A(){
		// x=50;     //2. Either initialize in constructor
	   }
	A(int y){
		// x=50;
	   }
	   {
		// x=100;        // 3. We can initialize through instance block..
	   }
	   static{
		a=45;			// 2. we can assign value in static block
	   }
	
}
class B extends A{

	B(){
		
	   }
	B(int y){
		super(y);
	}
	
}

class Demo11{
	public static void main(String args[]){
	A obj = new B();
	A obj1 = new B(25);
	// System.out.println(obj.x);
	// System.out.println(obj1.x);
	System.out.println(A.a);
}

}