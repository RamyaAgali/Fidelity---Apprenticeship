package assignment;

import java.util.Scanner;

public class array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
      average(arr);

    }
public static void average(int[] arr){
        float sum = 0;
        float av = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        av = sum / arr.length;
    System.out.println(av);

}


}
