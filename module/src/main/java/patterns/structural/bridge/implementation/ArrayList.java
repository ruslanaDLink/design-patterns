package patterns.structural.bridge.implementation;

import patterns.structural.bridge.abstraction.List;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    private Object[] list;
    private int size;
    private int capacity;

    public ArrayList(int capacity) throws Exception {
        this.capacity = capacity;
        if (capacity <= 0) {
            throw new Exception("Capacity must me greater 0!");
        }
        list = new Object[capacity];
        size = 0;
    }

    @Override
    public void addElement(T e) {
        validCapacity();
        list[size++] = e;
    }

    @Override
    public void removeElement(T e) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == e) {
                removeByIndex(i);
            }
        }
        list[--size] = null;
    }

    @Override
    public void removeByIndex(int index) {
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException("Improper value " + index + ". Index must be valid.");
        }
        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        list[--size] = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isElementInTheList(T e) {
        for (Object o : list) {
            if (o == e) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printElements() {
        System.out.println("Printing all elements");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    private void validCapacity() {
        if (size == list.length) {
            int resizedCapacity = list.length * 2;
            list = Arrays.copyOf(list, resizedCapacity);
        }
    }
}
