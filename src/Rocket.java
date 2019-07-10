public class Rocket implements SpaceShip {

    int cost;
    int rocketWeight;
    int cargoWeight;
    int maxCargo;
    int maxWeight;
    double launchFailure;
    double landFailure;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    //checks if the item exceeds max capacity
    public boolean canCarry(Item item) {
        return this.cargoWeight + item.weight <= maxWeight;
    }

    //updates the weight of a spaceship
    public void carry(Item item) {
        this.cargoWeight += item.weight;
    }

    public int getCost(){
        return cost;
    }
}

