public class TemporaryEmployee extends Employee {
    int DailyWages;
    int NoOfDays;

    public TemporaryEmployee(int id, String Name, int DailyWages, int NoOfDays) {
        super(id, Name, DailyWages * NoOfDays);
        this.DailyWages = DailyWages;
        this.NoOfDays = NoOfDays;
        Bonus();
        netSalary();
    }

    public void Bonus() {
        if (DailyWages < 1000) {
            Bonus = 0.15f * NetSalary;
        } else if (DailyWages >= 1000 && DailyWages < 1500) {
            Bonus = 0.12f * NetSalary;
        } else if (DailyWages >= 1500 && DailyWages < 1750) {
            Bonus = 0.11f * NetSalary;
        }else{
            Bonus = 0.08f * NetSalary;
        }
    }
    @Override
    public void display() {

        System.out.println("Daily Wages: " + DailyWages + "\nNo Of Days: " + NoOfDays);
       super.display();
    }
    @Override
    public void netSalary() {

        NetSalary = DailyWages * NoOfDays + Bonus;

    }

}
