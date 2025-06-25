// === Adapter ===

interface Logger {
    void log(String msg);
}

class OldLogger {
    public void write(String msg) {
        System.out.println("Staryi log: " + msg);
    }
}

class LoggerAdapter implements Logger {
    OldLogger oldLogger = new OldLogger();

    public void log(String msg) {
        oldLogger.write(msg);
    }
}
