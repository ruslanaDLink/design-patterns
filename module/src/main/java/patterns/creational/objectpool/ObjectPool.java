package patterns.creational.objectpool;

import patterns.creational.objectpool.abstraction.FileUtilityInterface;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends FileUtilityInterface> {
    private BlockingQueue<T> queue;

    public ObjectPool(Supplier<T> supplier, int size) {
        queue = new LinkedBlockingQueue<>();
        for (int i = 0; i < size; i++) {
            try {
                queue.put(supplier.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public T get() {
        try {
            return queue.take();
        } catch (InterruptedException e) {
            System.err.println(InterruptedException.class.getName() + " in get() method.");
        }
        return null;
    }

    public void release(T object) {
        object.reset();
        try {
            queue.put(object);
        } catch (InterruptedException e) {
            System.err.println(InterruptedException.class.getName() + "in release() method.");
        }
    }

    public void destroy(String path){
        java.io.File currentFile = new java.io.File(path);
        String fileName = currentFile.getName();
        if (currentFile.exists()) {
            boolean deleted = currentFile.delete();
            if (deleted) {
                System.out.println(fileName + " destroyed.");
            } else {
                System.err.println("Fail to delete " + fileName);
            }
        }
    }
}
