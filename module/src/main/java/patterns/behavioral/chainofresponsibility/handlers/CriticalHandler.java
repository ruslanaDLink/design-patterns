package patterns.behavioral.chainofresponsibility.handlers;

import patterns.behavioral.chainofresponsibility.EmergencyHandler;
import patterns.behavioral.chainofresponsibility.Level;
import patterns.behavioral.chainofresponsibility.Request;

import java.util.logging.Logger;

public class CriticalHandler implements EmergencyHandler {
    private static final Logger LOGGER = Logger.getLogger(CriticalHandler.class.getName());

    private EmergencyHandler handler;

    @Override
    public void handleRequest(Request request) {
        if (request.getLevel() == Level.CRITICAL) {
            LOGGER.info("Critical Handler accepts request.");
        } else {
            LOGGER.warning("critical handler can't handle the request.");
        }
    }

    @Override
    public void setNextHandler(EmergencyHandler handler) {
        this.handler = handler;
    }
}
