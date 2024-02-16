package chainOfResponsibilityPatternLogger;

public class ErrorLogger extends Logger {
    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int logValue) {
        if (logValue == error) {
            System.out.println("Hi Error Logger");
        }
        else {
            super.log(logValue);
        }
    }
}
