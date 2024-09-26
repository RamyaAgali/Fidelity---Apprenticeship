import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter shape:");
        String s = scan.next();
        if(s.equalsIgnoreCase("Cylinder")){

            System.out.println("Enter raius of cylinder:");
            double r = scan.nextDouble();
            System.out.println("Enter height of cylinder:");
            double h = scan.nextDouble();

            Cylinder cylinder=new Cylinder(r,h);
            System.out.println("volume of cylinder:"+cylinder.calculateVolume());
        } else if (s.equalsIgnoreCase("Cube")) {

            System.out.println("Enter side of cube:");
            double side = scan.nextDouble();

            cube cu = new cube(side);
            System.out.println("volume of cube:" +cu.calculateVolume());
        }else {
            System.out.println("unknown shape");
        }
    }
}