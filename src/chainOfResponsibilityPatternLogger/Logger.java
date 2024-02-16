package chainOfResponsibilityPatternLogger;

public abstract class Logger {
    public int info = 1;
    public  int debug = 2;
    public int error = 3;
    Logger nextLogger;

    Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
    public void log(int logValue) {
        if (nextLogger != null) {
            nextLogger.log(logValue);
        }
        else {
            System.out.println("Request got ended");
        }
    }
}
