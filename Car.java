import java.util.ArrayList;
//Sets up a car of the train
public class Car {
    private int maxCapacity;
    private ArrayList<Passenger> passengersOnboard;
    
    /** Constructor */
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<Passenger>();
    }

    /** Gives max capacity of car
     * @return max capacity of car
     */
    public int getCapacity(){
        System.out.println("The maximum capacity of this car is " + maxCapacity);
        return this.maxCapacity;
    }

    /** Gives # of remaining seats
     * @return # of remaining seats in car
     */
    public int seatsRemaining() {
        System.out.println("hyhy");
        return (this.maxCapacity-this.passengersOnboard.size());
    }

    /** Adds a passenger to car
     * @param p passenger being added to car
     */
    public void addPassenger(Passenger p) {
        if (this.maxCapacity == this.passengersOnboard.size()){
            throw new RuntimeException("This car is at max capacity, no more passengers can be let on.");
        }
        else if (this.passengersOnboard.contains(p)){
            throw new RuntimeException("This passenger is already on board.");
        }
        else {
            this.passengersOnboard.add(p);
        }
    }

    /** Removes a passenger from car
     * @param p passenger being removed from car
     */
    public void removePassenger(Passenger p) {
        if (this.passengersOnboard.contains(p)) {
            this.passengersOnboard.remove(p);
            System.out.println("The passenger " + p.name() + " is no longer on board.");
        }
        else {
            throw new RuntimeException("This passenger was not on board.");
        }
    }

    /** Prints formatted list of passengers in car */
    public void printManifest(){
        if (this.passengersOnboard.size() == 0){
            System.out.println("This car is empty.");
        }
        else{
            System.out.println("The passengers in this car are: ");
            for (int i=0; i<this.passengersOnboard.size(); i++){
                System.out.println(this.passengersOnboard.get(i).name());
            }
        }
    }
}