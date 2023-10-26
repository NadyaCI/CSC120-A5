// Sets up our engine
public class Engine {
    private FuelType fuelType;
    double currentFuel;
    double maxFuel;

    // Engine constructor
    public Engine(FuelType fuelType, double currentFuel) {
        this.fuelType = fuelType;
        this.currentFuel = currentFuel;
        this.maxFuel = 100.0;
    }

    // Refuels engine to its maximum
    public void refuel(){
        this.currentFuel = this.maxFuel;
    }

    // Lowers fuel level if there is fuel left
    public void go(){
        if (this.currentFuel == 0.0){
            throw new RuntimeException("You are now out of fuel. Refuel to continue."); 
        }
        else if (this.currentFuel<10.0) {
            this.currentFuel = 0.0;  
            System.out.println("Your current fuel level is 0.0");
        }
        else {
            this.currentFuel -= 10.0;    
            System.out.println("Your current fuel level is " + this.currentFuel);
        }
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel
        }
    }
}
