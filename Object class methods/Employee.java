public class Employee extends Person {
    int age;
    
    public Employee() {
    }


    public Employee(int id, String name, double salary, int age) {
        super(id,name,salary);
        this.age = age;
    }


    @Override
    public String toString() {
        return super.toString()+"Employee [age=" + age + "]";
    }


    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e);// when we print e then it calls default constructor of parent class and prints because we override toString in Person class : Person [id=0, name=null, salary=0.0]
    }
}
