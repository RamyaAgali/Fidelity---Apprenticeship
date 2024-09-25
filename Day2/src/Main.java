import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // Employee emp = new Employee();
        //emp.empid = 11;
        //  emp.empname = "RR";
        // emp.dept = "Enf";

        // Employee emp1 = new Employee();
        //emp1.empid = 12;
        //emp1.empname = "ssa";
        //emp1.dept = "Eng";
        //emp1.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int id = sc.nextInt();
        System.out.println("Enter Employee Name");
        String name = sc.next();
        System.out.println("Enter Employee Department");
        String dept = sc.next();
       // emp.Initializer(id, name, dept);
       // emp.display();
        Employee.show();
    }
}