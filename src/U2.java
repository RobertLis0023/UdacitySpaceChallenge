public class U2 extends Rocket {

    public U2 (){
        cost = 120; //in millions
        rocketWeight = 18; //in tonnes
        maxWeight = 29; //in tonnes
        maxCargo = 11; //in tonnes
    }

    public boolean launch(){
        launchFailure = 0.04 * (cargoWeight / maxCargo);
        double random = Math.random();

        if(launchFailure <= random){
            return true;
        }
        else{
            return false;
        }

    }
    public boolean land(){
        landFailure = 0.08 * (cargoWeight / maxCargo);
        double random = Math.random();

        if(landFailure <= random){
            return true;
        }
        else{
            return false;
        }

    }

}