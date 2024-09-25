package Sample;

public class Inheritance {
    public static void main (String[] args){
        Category ct = new Category();
        ct.productID = 203;
        ct.productName = "16 Series";
        ct.productPrice = 138000.45;
        ct.catId = 56;
        ct.catName = "mobile";
        //ct.Show();
        //ct.Display();
        Brand br = new Brand();
        br.name = "Apple";
        br.productID = 203;
        br.productName = "16 Series";
        br.productPrice = 138000.45;
        br.catId = 234;
        br.catName = "mobile";
        br.Display();
    }
}
