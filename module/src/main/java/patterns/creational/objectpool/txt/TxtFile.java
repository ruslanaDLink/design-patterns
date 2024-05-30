package patterns.creational.objectpool.txt;

import patterns.creational.objectpool.abstraction.File;
import patterns.creational.objectpool.abstraction.FileUtilityInterface;

import java.io.FileWriter;
import java.io.IOException;


public class TxtFile extends File implements FileUtilityInterface {
    private static final String EXTENSION = ".txt";
    private String path = "C:\\Users\\hp\\Downloads\\Demo\\design-patterns\\module\\src\\main\\java\\patterns\\creational\\objectpool\\txt\\files\\";
    private java.io.File file;

    public TxtFile() {
        file = new java.io.File(path);
    }

    @Override
    public String getExtension() {
        return EXTENSION;
    }

    @Override
    public void newBlankFile(String fileName) {
        file = new java.io.File(path + fileName + EXTENSION);
        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("Successfully created blank txt file " + fileName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void newContentFile(String fileName, String content) {
        file = new java.io.File(path + fileName + EXTENSION);
        try (FileWriter writer = new FileWriter(file)) {

                System.out.println("Successfully created content txt file " + fileName);
                writer.write(content);
                writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void reset() {
        System.out.println("TXT POOL RESET");
        file = null;
    }
}
