package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class cafeteria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of pizzas bought:");
        int pizza = sc.nextInt();
        int c1 = 200;
        System.out.println("Enter number of puffs bought:");
        int puffs = sc.nextInt();
        int c2 = 40;
        System.out.println("Enter number of cool drinks bought:");
        int cooldrink = sc.nextInt();
        int c3 = 120;
        System.out.println("BILL Details: ");
        int d1 = c1*pizza;
        int d2 = c2*puffs;
        int d3 = c3*cooldrink;
        System.out.println("total cost of pizzas bought:"+""+d1);
        System.out.println("total cost of puffs bought:"+""+d2);
        System.out.println("total cost of cooldrinks bought:"+""+d3);
        int dt = d1 + d2 + d3;
        System.out.println("TOTAL BILL AMOUNT:" + dt);
        }


    }

