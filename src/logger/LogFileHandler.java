package logger;

public class LogFileHandler implements LogObserver {
    @Override
    public String log(String text) {
        return text + " From logFileHandler";
    }
}
