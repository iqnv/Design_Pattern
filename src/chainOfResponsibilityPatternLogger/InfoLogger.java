package chainOfResponsibilityPatternLogger;

public class InfoLogger extends Logger{
    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int logValue) {
        if (logValue == info) {
            System.out.println("Hi Info Logger");
        }
        else {
            super.log(logValue);
        }
    }
}
