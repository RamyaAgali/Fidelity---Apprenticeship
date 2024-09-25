import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        {
           Scanner scanner = new Scanner(System.in);
            System.out.println("Enter marks scored:");
           int n = scanner.nextInt();
           String grade = "";
           if( n >= 90){
               grade = "A";
           } else if ( n >= 80) {
               grade = "B";
           } else if ( n >= 70) {
               grade = "C";
           }
           else {
               grade = "Fail";
           }
           switch (grade){
               case "A":
                   System.out.println("Grade:" + grade);
                   System.out.println("Excellent");
                   break;
                   case "B":
                       System.out.println("Grade:" + grade);
                       System.out.println("Good");
                       break;
                       case "C":
                           System.out.println("Grade:" + grade);
                           System.out.println("Average");
                           break;
               default:
                   System.out.println("Grade:" + grade);
                   System.out.println("Have to work hard");
           }

        }
    }
}