public class U1 extends Rocket {

    public U1 (){
        cost = 100;
        rocketWeight = 10; //in tonnes
        maxWeight = 18; //in tonnes
        maxCargo = 8; //in tonnes
    }

    public boolean launch(){
        launchFailure = 0.05 * (cargoWeight / maxCargo);
        double random = Math.random();

        if(launchFailure <= random){
            return true;
        }
        else{
            return false;
        }

    }
    public boolean land(){
        landFailure = 0.01 * (cargoWeight / maxCargo);
        double random = Math.random();

        if(landFailure <= random){
            return true;
        }
        else{
            return false;
        }

    }

}
