import java.util.Scanner;

public class stringConcate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String first = scan.nextLine();
        System.out.println("Enter second string: ");
        String second = scan.nextLine();
        String result = first.concat(second);
        System.out.println(result);
        String result2 = first+""+second;
        System.out.println(result2);
    }
}
