package Sample;

public class Brand extends Category{
    String name;

    @Override
    public void Display() {
        System.out.println("Brand: " + name);
        super.Display();
    }
}
