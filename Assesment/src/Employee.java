public class Employee {
    int ID;
    String Name;
    float BasicSalary;
    float Bonus;
    float NetSalary;

    public Employee(int ID, String Name, float BasicSalary){
        this.ID = ID;
        this.Name = Name;
        this.BasicSalary = BasicSalary;

    }
    public void display(){
        System.out.println("Employee ID: " + ID +"\nEmployee Name: " + Name + "\nBasic Salary: " + BasicSalary + "\nBonus: " + Bonus +"\nNet Salary: " + NetSalary);
    }
    public void netSalary(){
        NetSalary = BasicSalary + Bonus;
    }
}
