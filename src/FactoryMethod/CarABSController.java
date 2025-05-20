package FactoryMethod;

public class CarABSController extends ABSController{
    @Override
    public ABSSensor makeABSSensor() {
        log("Making a new Car ABS Sensor");
        return new CarABSSensor();
    }
}
