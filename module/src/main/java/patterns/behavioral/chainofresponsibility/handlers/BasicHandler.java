package patterns.behavioral.chainofresponsibility.handlers;

import patterns.behavioral.chainofresponsibility.EmergencyHandler;
import patterns.behavioral.chainofresponsibility.Level;
import patterns.behavioral.chainofresponsibility.Request;

import java.util.logging.Logger;

public class BasicHandler implements EmergencyHandler {
    private static final Logger LOGGER = Logger.getLogger(BasicHandler.class.getName());

    private EmergencyHandler handler;

    @Override
    public void handleRequest(Request request) {
        if (request.getLevel() == Level.BASIC) {
            LOGGER.info("Basic Handler accepts request.");
        } else {
            this.handler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(EmergencyHandler handler) {
        this.handler = handler;
    }
}
