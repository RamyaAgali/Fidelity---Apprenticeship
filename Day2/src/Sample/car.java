package Sample;

public class car extends vehicle {
        String name;
        double speed;
        public void Display(){
            System.out.println("Vehicle Name: " + name + "\nVehicle Speed: " + speed);
            super.Show();
        }
    }
