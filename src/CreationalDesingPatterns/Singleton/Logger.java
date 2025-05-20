package CreationalDesingPatterns.Singleton;

public class Logger { // This is the singleton object
    // we define a static shareable object as a constant
    private static final Logger INSTANCE = new Logger();
    private int logCount;

    private Logger(){ // private constructor
        logCount = 0;
    }
    public static Logger getInstance(){ // static operation
        return INSTANCE;
    }
    public void incCount(){logCount++;}
    public int getCount(){return logCount;}
}
