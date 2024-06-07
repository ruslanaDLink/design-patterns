package patterns.structural.bridge.abstraction;

//abstraction
public interface OrderedCollection<T> {

    void add(T e);

    void remove(T e);

    void printList();

    boolean contains(T e);
}
