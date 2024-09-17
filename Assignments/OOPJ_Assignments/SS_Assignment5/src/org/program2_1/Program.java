package org.program2_1;
import org.program2.*;

public class Program {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        
        logger.log("This is the first log message.");
        logger.log("This is the second log message.");
        
        System.out.println("Log Contents:");
        System.out.println(logger.getLog());
        
        logger.clearLog();
        
        System.out.println("Log Contents after clear:");
        System.out.println(logger.getLog());
    }
}