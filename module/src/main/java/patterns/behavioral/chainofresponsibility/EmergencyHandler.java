package patterns.behavioral.chainofresponsibility;

public interface EmergencyHandler {
    void handleRequest(Request request);

    void setNextHandler(EmergencyHandler handler);
}
