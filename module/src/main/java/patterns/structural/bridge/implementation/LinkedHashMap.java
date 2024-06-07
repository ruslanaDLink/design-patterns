package patterns.structural.bridge.implementation;

import patterns.structural.bridge.abstraction.List;
import patterns.structural.bridge.abstraction.OrderedCollection;

//a refined abstraction
public class LinkedHashMap<T> implements OrderedCollection<T> {
    private List<T> list;

    public LinkedHashMap(List<T> list) {
        this.list = list;
    }

    @Override
    public void add(T e) {
      list.addElement(e);
    }

    @Override
    public void remove(T e) {
        list.removeElement(e);
    }

    @Override
    public void printList() {
        list.printElements();
    }
}
