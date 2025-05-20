package CreationalDesignPatterns.FactoryMethod;

// Abstract/Generic ABS Sensor module
abstract class ABSSensor {
    public void install(){log("I'm a Generic ABS Sensor");}
    public void log(String s){
        System.out.println(s);
    }
}
