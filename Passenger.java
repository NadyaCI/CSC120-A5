// Sets up a new passenger
public class Passenger {
    
    private String name;

    // Passenger constructor
    public Passenger(String name) {
        this.name = name;
    }

    // Adds the passenger to a car
    public void boardCar(Car c){
        try {
            c.addPassenger(this);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    // Removes the passenger from a car
    public void getOffCar(Car c){
        try {
            c.removePassenger(this);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    // Gives the name of the passenger
    public String name() {
        return this.name;
    }
}
