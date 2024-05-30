package patterns.creational.objectpool.abstraction;

public interface FileUtilityInterface {

    void newBlankFile(String fileName);

    void newContentFile(String fileName, String content);

    void reset();

}
