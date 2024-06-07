package patterns.structural.bridge.abstraction;

public interface List<T> {

    void addElement(T e);

    void removeElement(T e);

    void removeByIndex(int index);

    int size();

    boolean isElementInTheList(T e);

    void printElements();
}
