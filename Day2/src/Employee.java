public class Employee {
    private int empid;
   private String empname;
     private String dept;
    static String orgname = "fiedility";

   // public void Initializer(int empid, String name, String Dept)
    Employee(int empid, String empname, String dept)
    {
        this.empid = empid;
        this.empname = empname;
        this.dept = dept;

    }
    public void display(){
        System.out.println("Employee ID: " + empid + "\nEmployee Name: " + empname + "\nDepartment: " + dept);
    }

    public static void show(){
        System.out.println("Employee organization name: " + orgname);
    }
}
