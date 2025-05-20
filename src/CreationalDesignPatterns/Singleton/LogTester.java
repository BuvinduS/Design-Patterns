package CreationalDesignPatterns.Singleton;

public class LogTester {
    public static void main(String[] args) {
        // We define a set of Logger object references
        Logger[] log = new Logger[5];

        for (int i = 0; i < 5; i++) {
            // a new Logger object is assigned for each reference
            log[i] = Logger.getInstance();
            log[i].incCount();
            /*
            * Although we increase the logCount individually for each object
            * it can be seen that only a single instance of the Logger object exists
            */
            System.out.println("Log count is "+log[i].getCount());
        }
    }
}
