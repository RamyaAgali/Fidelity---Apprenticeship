package Sample;

public class Category extends Product{
    int catId;
    String catName;

    public void Show(){
        System.out.println("Category ID:" + catId + "\nCategory Name:" + catName);
    }
    @Override
    public void Display(){
        super.Display();
        System.out.println("Category ID:" + catId + "\nCategory Name:" + catName);
    }
}
