class Logger {

    private static Logger instance;

    private Logger() {
        System.out.println("Logger instance created.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

public class SingletonPattern {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.displayMessage("Application Started");
        logger2.displayMessage("Singleton Pattern Demonstration");

        if (logger1 == logger2) {
            System.out.println("Both objects refer to the same instance.");
        }
    }
}