package logger;

import java.util.ArrayList;
import java.util.List;

class Logger implements Observable {
    private List<LogObserver> handlers;

    public Logger() {
        this.handlers = new ArrayList<>();
    }

    public void register(LogObserver handler) {
        handlers.add(handler);
    }

    public void unRegister(LogObserver handler) {
        handlers.remove(handler);
    }

    public void logMsg(String text) {
        for (LogObserver handler : handlers) {
            handler.log(text);
        }
    }

}
