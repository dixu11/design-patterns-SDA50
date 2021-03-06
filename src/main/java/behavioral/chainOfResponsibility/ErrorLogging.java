package behavioral.chainOfResponsibility;

public class ErrorLogging implements Logging {

    @Override
    public void log(String message) {
        System.err.println("ERROR: " + message.toUpperCase());
    }
}
