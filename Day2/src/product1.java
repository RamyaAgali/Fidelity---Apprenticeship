import java.util.Scanner;

class Array{
    int proid;
    String proname;
    double price;

    public void product(int proid, String proname, double price){
        this.proid = proid;
        this.proname = proname;
        this.price = price;

    }
    public void show(){
        System.out.println("Product ID:" + proid + "\nProduct Name: " + proname + "\nProduct price: " + price);

    }

}




public class product1 {
    public static void main(String[] args){

        Array[] ar = new Array[5];
       ar[0] = new Array(101, "Laptop", 99909,89);
        ar[1] = new Array(102, "Laptop", 99909,89);
        ar[2] = new Array(103, "Laptop", 99909,89);
        ar[3] = new Array(104, "Laptop", 99909,89);
        ar[4] = new Array(105, "Laptop", 99909,89);
        for(Array a : ar){
            ar.show();
        }


    }
}
