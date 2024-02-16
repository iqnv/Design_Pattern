package chainOfResponsibilityPatternLogger;

public class DebugLogger extends Logger{
   public DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int logValue) {
        if (logValue == debug) {
            System.out.println("Hi Debug Logger");
        }
        else {
            super.log(logValue);
        }
    }
}
