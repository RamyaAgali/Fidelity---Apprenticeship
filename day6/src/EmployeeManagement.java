import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private String name;

    public Employee(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
public class EmployeeManagement {
    private List<Employee> employees;
    public EmployeeManagement(){
        employees =  new ArrayList<>();
        employees.add(new Employee("Anand"));
        employees.add(new Employee("Bob"));
        employees.add(new Employee("Alice"));
        employees.add(new Employee("Arun"));
        employees.add(new Employee("Ramya"));
    }
    public void display(){
        List<Employee> filterdEmployees = employees.stream().filter(emp -> emp.getName().startsWith("A")).collect(Collectors.toList());
        if(filterdEmployees.isEmpty()){
            System.out.println("No employee found");
        }else{
            System.out.println("Employees whose name starts with 'A':");
            for(Employee emp : filterdEmployees){
                System.out.println(emp.getName());
            }
        }
    }
    public static void main(String[] args) {
        EmployeeManagement Management = new EmployeeManagement();
        Management.display();
    }

}
