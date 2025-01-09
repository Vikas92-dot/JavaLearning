/*

hashing is a mthode which is used to identify the object on the basis of its address and it do so by using the hashcode method and it creates a hashcode for the object and store it in the memory or hashtable and whenever we try to create a new object it will call the hashcode method




 *HashCode // whenever we try to create a new object it will call the hashcode method
it is a method which gives integer representation of the address of the object
it is the unique identifier of the object and it is used to identify the object on the basis of its address
we can also use the hashcode method to identify the object on the basis of its data but we need to override it in the sub class

 * When two objects will be same or identical then they will have same hashcode and equals method will return true
 */

 class Person1 {
    int id;
    String name;
    double salary;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Person1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
Person1(){
    
}
public boolean equals(Person p) {
    return this.id == p.id && this.name.equals(p.name) && this.salary == p.salary;
}



@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    long temp;
    temp = Double.doubleToLongBits(salary);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
}



public class three {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person1 p = new Person1(101, "Rahul", 10000);
        Person1 p1 = new Person1(101, "Rahul", 10000);
        Person1 p2 = p1;
        int a= 100;
        int b= 100;
        System.out.println(a==b);
        System.out.println(p==p1);
        System.out.println(p);
        System.out.println(p2 == p1);
        System.out.println(p.equals(p1));
         System.out.println(p.hashCode());
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
 }

