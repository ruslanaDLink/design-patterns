package patterns.structural.facade;

public interface SmartManager<T> {
    void download(T resource);

    String getProperties(T t);
}
