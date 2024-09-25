
public class Main {
    public static void main(String[] args) {
    PermanentEmployee per = new PermanentEmployee(101,"Esther",25000, 1500);
        System.out.println("Permanent Employee Details:");
        per.display();
        System.out.println();
    TemporaryEmployee te = new TemporaryEmployee(102, "Ganesh",1500, 20);
        System.out.println("Temporary Employee Details:");
        te.display();
    }
}