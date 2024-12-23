public class Employee extends Person{
    private int empId;
    private String jobTitle;

    public Employee(String firstName,String lastName,int empId,String jobTitle){
        super(firstName,lastName);
        this.empId = empId;
        this.jobTitle = jobTitle;
    }
    public Employee(){
        
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
}
