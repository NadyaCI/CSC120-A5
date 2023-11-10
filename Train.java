import java.util.ArrayList;
// Sets up a train
public class Train {
    private final Engine engine;
    private ArrayList<Car> attatchedCars;

    // Train constructor
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, fuelCapacity);
        this.attatchedCars = new ArrayList<Car>();
    }

    // Returns the train's engine
    public Engine getEngine(){
        return engine;
    }

    // Returns a given car
    public Car getCar(int i){
        if (i >= attatchedCars.size()){
            throw new RuntimeException("This train does not have " + i + " cars.");
        }
        else {
            return attatchedCars.get(i);
        }
    }

    // Returns the maximum capacity of the train
    public int getMaxCapacity(){
        int i=0;
        for (int j=0; j<attatchedCars.size(); j++){
            i += attatchedCars.get(j).getCapacity();
        }
        return i;
    }

    // Returns the remaining number of seats
    public int seatsRemaining(){
        int i=0;
        for (int j=0; j<attatchedCars.size(); j++){
            i += attatchedCars.get(j).seatsRemaining();
        }
        return i;
    }

    // Prints list of all passengers on board
    public void printManifest(){
        for (int i=0; i<this.attatchedCars.size(); i++){
            System.out.println("Car " + i);
            attatchedCars.get(i).printManifest();
        }
    }
}
