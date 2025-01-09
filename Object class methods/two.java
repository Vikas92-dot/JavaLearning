class Person {
    int id;
    String name;
    double salary;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Person(int id, String name, double salary) {
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
Person(){
    
}
public boolean equals(Person p) {
    return this.id == p.id && this.name.equals(p.name) && this.salary == p.salary;
}
}


public class two {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person p = new Person(101, "Rahul", 10000);
        Person p1 = new Person(101, "Rahul", 10000);
        Person p2 = p1;
        int a= 100;
        int b= 100;
        
        System.out.println(p);
        System.out.println(p1);
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

/*
 * Here we have discussed about the Equals() method in java.
 * which is in the object class of java
 *And its default implementation is in the Object class which is in the java.lang package
And it has default behaviour which is to compare the object reference and address
which we have to override it in the sub class that we are creating
 */