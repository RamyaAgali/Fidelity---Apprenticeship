package Sample;

public class truck extends vehicle  {
        String name;
        int speed;
        public void Display(){
            System.out.println("Vehicle name: "  + name + "\nVehicle speed: " + speed);
            super.Show();
        }
    }
