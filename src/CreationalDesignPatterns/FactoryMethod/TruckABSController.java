package CreationalDesignPatterns.FactoryMethod;

public class TruckABSController extends ABSController{
    @Override
    public ABSSensor makeABSSensor() {
        log("Making a new truck ABS Sensor");
        return new TruckABSSensor();
    }
}
