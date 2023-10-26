import java.util.ArrayList;
//Sets up a car of the train
public class Car {
    int maxCapacity;
    private ArrayList<Passenger> passengersOnboard;
    
    // Car constructor
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    // Returns maximum capacity
    public int getCapacity(){
        System.out.println("The maximum capacity of this car is " + maxCapacity);
        return this.maxCapacity;
    }

    // Returns how many seats are left
    public int seatsRemaining() {
        System.out.println("hyhy");
        return (this.maxCapacity-this.passengersOnboard.size());
    }

    // Adds a passenger to the car
    public void addPassenger(Passenger p) {
        if (this.maxCapacity == this.passengersOnboard.size()){
            throw new RuntimeException("This car is at max capacity, no more passengers can be let on.");
        }
        else {
            this.passengersOnboard.add(p);
        }
    }

    // Removes a passenger from the car
    public void removePassenger(Passenger p) {
        if (this.passengersOnboard.contains(p)) {
            this.passengersOnboard.remove(p);
            System.out.println("The passenger is no longer on board."); // ADD WAY TO SPECIFY NAME
        }
        else {
            throw new RuntimeException("This passenger was not on board.");
        }
    }

    // Lists all passengers in the car
    public void printManifest(){
        if (this.passengersOnboard.size() == 0){
            System.out.println("This car is empty.");
        }
        else{
            System.out.println("The passengers in this car are: ");
            for (int i=0; i<this.passengersOnboard.size(); i++){
                Passenger passenger = this.passengersOnboard.get(i);
                System.out.println(passenger.name());
            }
        }
    }
}