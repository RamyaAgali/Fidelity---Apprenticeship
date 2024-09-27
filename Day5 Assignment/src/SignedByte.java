import java.util.Scanner;

public class SignedByte {
    public static void main(String[] args) {
        byte number;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            number = scan.nextByte();
            if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                System.out.println("The maximum value stored in a signed Byte is: " + number);
            } else{
                System.out.println("Entered number is out of the signed byte range: " + number);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
