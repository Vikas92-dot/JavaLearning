interface LibraryOperations {
    void issueBook();
    void returnBook();
}
class Teacher implements LibraryOperations{
    public void issueBook(){
        System.out.println("Book issued by Teacher..");
    }
    public void returnBook(){
        System.out.println("Book return to Teacher");
    }
}
class Student implements LibraryOperations{
    public void issueBook(){
        System.out.println("Book issued to Student..");
    }
    public void returnBook(){
        System.out.println("Book return by Student");
    }
}
public class LibraryOperationsMain {
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.issueBook();
        obj.returnBook();

        Student obj1 = new Student();
        obj1.issueBook();
        obj1.returnBook();
    }
}   
