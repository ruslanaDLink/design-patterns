package patterns.structural.proxy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DataStorage {

    protected String printData() {
        StringBuilder data = new StringBuilder();
        File file = new File("C:\\Users\\hp\\Desktop\\new_data\\document.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String text;
            while ((text = reader.readLine()) != null) {
                data.append(text).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data.toString();
    }

}
