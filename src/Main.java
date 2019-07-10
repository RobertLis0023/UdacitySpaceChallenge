public class Main {

    public static void main(String[] args) {

        Simulation sim = new Simulation();

        //load item lists
        sim.loadItems("Phase-1.txt");
        sim.loadItems("Phase-2.txt");

        System.out.println("Simulating U1 type rockets.");

        int cost_U1 = sim.runSimulation(sim.loadU1());
        System.out.println("Total cost for U1 rockets: " + cost_U1 + " millions.");

        System.out.println("Simulating U2 type rockets.");

        int cost_U2 = sim.runSimulation(sim.loadU2());
        System.out.println("Total cost for U2 rockets: " + cost_U2 + " millions.");
    }
}