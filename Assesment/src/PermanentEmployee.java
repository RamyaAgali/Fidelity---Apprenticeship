public class PermanentEmployee extends Employee {
    int pf;

    public PermanentEmployee(int id, String Name, float BasicSalary, int pf) {
        super(id, Name, BasicSalary);
        this.pf = pf;
        bonus();
        netSalary();
    }
    @Override
    public void netSalary() {
        NetSalary = BasicSalary - pf + Bonus;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("PF: " + pf);
    }
    public void bonus(){
        if(pf < 1000){
            Bonus = 0.1f*BasicSalary;
        } else if (pf >= 1000 && pf < 1500) {
            Bonus = 0.115f*BasicSalary;
        } else if (pf >= 1500 && pf < 1800) {
            Bonus = 0.12f*BasicSalary;
        }else {
            Bonus = 0.15f*BasicSalary;
        }
    }
}
