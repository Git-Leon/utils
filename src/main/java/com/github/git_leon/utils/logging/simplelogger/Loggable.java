package com.github.git_leon.utils.logging.simplelogger;

public interface Loggable {
    default SimpleLoggerInterface getLogger() {
        return SimpleLoggerWarehouse.getLogger(getClass().getName());
    }
}
