import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
       double num = sc.nextDouble();
       double res1 = findSquare(num);
       double res2 = findCube(num);
        System.out.println("Square of " + num + " is " + res1);
        System.out.println("Cube of " + num + " is " + res2);

    }
    static double findSquare(double num){
        return num*num;
    }
    static double findCube(double num){
        return num*num*num;
    }
}
