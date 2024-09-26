import java.util.Scanner;

public class Cylinder extends Shape {
    double radius;
    double height;

    public Cylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
    }
    @Override
    public double calculateVolume() {

         return Math.PI*radius*radius*height;
    }

    }

//    @Override
//    double calculateVolume() {
//        return 0;
//    }
//}
class cube extends Shape {
    double side;

   public cube(double side){
       this.side=side;
   }

    @Override
    public double calculateVolume() {
        return  side*side*side;
    }
}