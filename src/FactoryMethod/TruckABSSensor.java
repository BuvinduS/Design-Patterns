package FactoryMethod;

public class TruckABSSensor extends ABSSensor{
    @Override
    public void install() {
        log("I'm a truck ABS Sensor");
    }
}
