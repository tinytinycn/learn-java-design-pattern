package chain;

import chain.logger.AbstractLogger;
import chain.logger.ConsoleLogger;
import chain.logger.ErrorLogger;
import chain.logger.FileLogger;

public class Client {
    public AbstractLogger getChainOfLoggers() {
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        // 设置logger的下一级logger  error > file > console
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public void test() {
        AbstractLogger logger = getChainOfLoggers();
        logger.logMessage(AbstractLogger.INFO, "this is a information");

        logger.logMessage(AbstractLogger.DEBUG, "this is a debug level information");

        logger.logMessage(AbstractLogger.ERROR, "this is a error level information");
    }
}
