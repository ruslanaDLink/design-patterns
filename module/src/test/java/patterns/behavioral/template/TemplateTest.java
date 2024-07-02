package patterns.behavioral.template;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TemplateTest {

    @Test
    public void test() {
        Printer htmlPrinter = new HtmlPrinter();
        Printer jsonPrinter = new JsonPrinter();

        String header = "forecast-england.com";
        String title = "Forecast Today";
        String listName = "Gale Predictor on:";
        List<String> values = new ArrayList<>();
        values.add("03/03/2024");
        values.add("04/03/2024");
        values.add("07/03/2024");
        String total = "Remaining days will be sunny and warm. Enjoy the summer!";

        Topic topic = new Topic(title, header,listName, values, total);

        htmlPrinter.print("C:\\Users\\hp\\Desktop\\projects\\html-forecast.txt", topic);
        jsonPrinter.print("C:\\Users\\hp\\Desktop\\projects\\json-forecast.txt", topic);
    }
}