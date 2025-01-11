import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private String name;
    private int age;
    private double marks;

    public Student() {
    }

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
    }
    
        
}
public class Que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of objects");
        int size = Integer.parseInt(sc.nextLine());

        ArrayList<Student> al = new ArrayList<Student>(size);
        Student student;

        for(int i=0; i<size; i++){
            System.out.println("Enter name of Student:");
            String name = sc.nextLine();
            System.out.println("Enter age of Student:");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Enter marks of Student:");
            double marks = Double.parseDouble(sc.nextLine());

            student = new Student(name,age,marks);
            al.add(student);
        }

        System.out.println(al);
    }
}
