import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = scan.nextLine();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if( i > 0){
                System.out.print(" ");
            }
        }
        scan.close();
    }
}
