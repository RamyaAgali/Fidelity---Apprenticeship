import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first Operand:");
        int a = scan.nextInt();
        System.out.println("Enter second Operand:");
        int b = scan.nextInt();
        System.out.println("Enter operator");
        char op = scan.next().charAt(0);

        Calculator c = new Calculator();


        switch(op){
            case '+':
                System.out.println("Result is:" + c.Addition(a,b));
                break;
            case '-':
                System.out.println("Result is:" + c.Subtraction(a,b));
                 break;
            case '*':
                System.out.println("Result is:" + c.Multiplication(a,b));
                break;
            case '/':
                c.Division(a,b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
