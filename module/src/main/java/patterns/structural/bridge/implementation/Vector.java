package patterns.structural.bridge.implementation;

import patterns.structural.bridge.abstraction.List;

public class Vector<T> implements List<T> {
    private Object[] vector;
    private int size;
    private int capacity;

    public Vector(int capacity) throws Exception {
        this.capacity = capacity;
        if (capacity <= 0) {
            throw new Exception("Capacity must me greater 0!");
        }
        vector = new Object[capacity];
        size = 0;
    }

    @Override
    public void addElement(T e) {
        validCapacity();
        vector[size++] = e;
    }

    @Override
    public void removeElement(T e) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == e) {
                removeByIndex(i);
            }
        }
        vector[size--] = null;
    }

    @Override
    public void removeByIndex(int index) {
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException("Improper value " + index + ". Index must be valid.");
        }
        for (int i = index; i < size - 1; i++) {
            vector[i] = vector[i + 1];
        }
        vector[size--] = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T e) {
        for (Object o : vector) {
            if (o == e) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printElements() {
        System.out.println("Printing all elements");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    private void validCapacity() {
        if (size == vector.length) {
            int resizedCapacity = vector.length * 2;
            Object[] newVector = new Object[resizedCapacity];
            System.arraycopy(vector, 0, newVector, 0, size);
            vector = newVector;
        }
    }
}
