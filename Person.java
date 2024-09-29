import java.time.LocalDate;
import java.time.Period;
 class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;

    public Person(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public LocalDate getDob() {
        return dob;
    }

    public int Getage(LocalDate dob) {
        LocalDate currentDate = LocalDate.now();
        if(dob != null){
            return Period.between(dob, currentDate).getYears();
        }else{
            return 0;
        }
    }
    public String getAdult(){
        int age = Getage(this.dob);
        return (age >= 18) ? "Adult" : "Child";
    }

    public void display(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Dob: " + dob);
        System.out.println("Age: " + Getage(this.dob));
        System.out.println("Status: " + getAdult());
    }

}




