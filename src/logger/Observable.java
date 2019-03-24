package logger;

interface Observable {
    void register(LogObserver handler);

    void unRegister(LogObserver handler);

    void logMsg(String text);
}
