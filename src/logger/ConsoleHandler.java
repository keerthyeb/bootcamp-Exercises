package logger;

public class ConsoleHandler implements LogObserver {

    @Override
    public String log(String text) {
        return text + " From consoleHandler";
    }
}
