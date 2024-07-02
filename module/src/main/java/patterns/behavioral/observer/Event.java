package patterns.behavioral.observer;

//subject
public interface Event {
    void add(Visitor visitor);

    void remove(Visitor visitor);

    void notifyVisitors();
}
