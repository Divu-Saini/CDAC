package org.program2;


public class Logger {
	   
    private static Logger instance;

  
    private StringBuilder logMessages;

   
    private Logger() {
        logMessages = new StringBuilder();
    }

   
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

  
    public synchronized void log(String message) {
        if (message != null && !message.trim().isEmpty()) {
            logMessages.append(message).append(System.lineSeparator());
        }
    }

   
    public synchronized String getLog() {
        return logMessages.toString();
    }

   
    public synchronized void clearLog() {
        logMessages.setLength(0);
    }
}
