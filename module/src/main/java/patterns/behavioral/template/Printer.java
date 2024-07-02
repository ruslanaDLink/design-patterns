package patterns.behavioral.template;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public abstract class Printer {

    public void print(String fileName, Topic topic) {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println(printStart());
            writer.println(printHeader(topic.getHeader()));
            writer.println(printTitle(topic.getTitle()));
            writer.println(printList(topic.getListName(), topic.getItems()));
            writer.println(printTotal(topic.getTotal()));
            writer.println(printEnd());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public abstract String printStart();

    public abstract String printHeader(String header);

    public abstract String printTitle(String title);

    public abstract String printList(String name, List<String> items);

    public abstract String printTotal(String total);

    public abstract String printEnd();
}
