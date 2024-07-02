package patterns.behavioral.observer;

//observer
public interface Visitor {
    String getName();
    String getFullInfo();
    void getUpdated(String update);
}
