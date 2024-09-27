import java.util.Scanner;

public class Registraion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = scan.next();
        System.out.println("Enter Your Age:");
        int age = scan.nextInt();
        System.out.println("Enter Your country:");
        String country = scan.next();
        System.out.println("Welcome" +" "+ name +"." + "Your age is " + age + " and you are from" +" "+ country);
    }
}
