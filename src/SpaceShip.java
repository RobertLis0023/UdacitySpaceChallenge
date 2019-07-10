public interface SpaceShip {
    boolean launch(); //check for successful launch
    boolean land(); //check for successful landing
    boolean canCarry(Item item); //checks if the item exceeds max capacity
    void carry(Item item); //updates the weight of a spaceship
}
