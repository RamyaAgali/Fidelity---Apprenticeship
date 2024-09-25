package Sample;

public class hirarchical {
    public static void main(String[] args) {
        truck t = new truck();
        t.name = "Bulero";
        t.sound = "Horn";
        t.speed = 123;
        car c = new car();
        c.name = "Benz";
        c.speed = 250;
        c.sound = "Horn";
        t.Display();
        t.Show();
        c.Display();
        c.Show();



    }
}

