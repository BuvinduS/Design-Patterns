package FactoryMethod;

public class CarABSSensor extends ABSSensor{
    @Override
    public void install() {
        log("I'm a car ABS Sensor");
    }
}
