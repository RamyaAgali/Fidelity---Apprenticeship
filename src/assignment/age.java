package assignment;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        a(age);
    }
    public static void a(int age){
        if (age >= 18) {
            System.out.println("eligeble to vote");
        }
        else{
            System.out.println("not eligeble to vote");
        }
    }
}
