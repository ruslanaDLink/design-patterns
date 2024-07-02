package patterns.behavioral.template;

import java.util.List;

public class HtmlPrinter extends Printer {
    @Override
    public String printStart() {
        return "<html>";
    }

    @Override
    public String printHeader(String header) {
        return "<body>\n<h1>" + header + "</h1>";
    }

    @Override
    public String printTitle(String title) {
        return "<head><title>" + title + "</title></head>";
    }

    @Override
    public String printList(String name, List<String> items) {
        String htmlItems = "";

        for (String item : items) {
            htmlItems += "\n<li>" + item + "</li>";
        }
        return "<h2>" + name + "</h2>\n<ul>" + htmlItems + "\n</ul>";
    }

    @Override
    public String printTotal(String total) {
        return "<p>" + total + "</p>";
    }

    @Override
    public String printEnd() {
        return "</body>\n</html>";
    }
}
