package FactoryMethod;

abstract class ABSController {
    private ABSSensor abss;

    // Factory method
    public abstract ABSSensor makeABSSensor();

    public void log(String s){
        System.out.println(s);
    }
    public void install(){
        log("Making a controller");
        abss = makeABSSensor();
        abss.install();
    }
}
