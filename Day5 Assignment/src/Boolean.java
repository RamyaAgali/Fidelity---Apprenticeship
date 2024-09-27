import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of X:");
        int x = scan.nextInt();
        System.out.println("Enter value of Y:");
        int y = scan.nextInt();
        boolean result = check(x,y);
        if(result == true){
            System.out.println("The result of whether X is less than Y is " + result);
        } else {
            System.out.println("The result of whether X is less than  Y is " + result);
        }

    }
    static boolean check(int x, int y) {
        if(x < y ){
            return true;
        } else{
            return false;
        }
    }
}
