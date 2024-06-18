package patterns.behavioral.chainofresponsibility;

import patterns.behavioral.chainofresponsibility.handlers.BasicHandler;
import patterns.behavioral.chainofresponsibility.handlers.ComplexHandler;
import patterns.behavioral.chainofresponsibility.handlers.CriticalHandler;

public class ChainDemo {
    public static void main(String[] args) {
        Request basicRequest = new Request(Level.BASIC);
        Request complexRequest = new Request(Level.COMPLEX);
        Request criticalRequest = new Request(Level.CRITICAL);

        EmergencyHandler basicHandler = new BasicHandler();
        EmergencyHandler complexHandler = new ComplexHandler();
        EmergencyHandler criticalHandler = new CriticalHandler();

        basicHandler.setNextHandler(complexHandler);
        complexHandler.setNextHandler(criticalHandler);

        complexHandler.handleRequest(basicRequest);
        basicHandler.handleRequest(criticalRequest);

    }
}
