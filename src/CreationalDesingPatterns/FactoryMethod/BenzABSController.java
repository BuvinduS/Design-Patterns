package CreationalDesingPatterns.FactoryMethod;

public class BenzABSController {
    public static void main(String[] args) {
        CarABSController carabs = new CarABSController();
        carabs.install();

        TruckABSController truckabs = new TruckABSController();
        truckabs.install();
    }
}
