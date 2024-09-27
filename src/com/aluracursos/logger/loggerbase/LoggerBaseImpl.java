package com.aluracursos.logger.loggerbase;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LoggerBaseImpl implements LoggerBase {

    private final Logger logger;

    public LoggerBaseImpl(String className) {
        logger = Logger.getLogger(className);

        // Verificar si el logger ya tiene manejadores antes de agregar uno nuevo
        if (logger.getHandlers().length == 0) {
            ConsoleHandler handler = new ConsoleHandler();
            handler.setFormatter(new Formatter() {
                @Override
                public String format(LogRecord record) {
                    return formatMessage(record) + "\n";  // Solo imprime el mensaje
                }
            });
            logger.addHandler(handler);
        }

        // Desactivar los manejadores padres por defecto solo una vez
        logger.setUseParentHandlers(false);
    }

    @Override
    public void logInfo(String message) {
        logger.info(message);
    }

    @Override
    public void logWarning(String message) {
        logger.warning(message);
    }
}
