package patterns.behavioral.template;

import java.util.List;

public class JsonPrinter extends Printer {
    @Override
    public String printStart() {
        return "{";
    }

    @Override
    public String printHeader(String header) {
        return "\"header\":\"" + header + "\"";
    }

    @Override
    public String printTitle(String title) {
        return "\"title\":\"" + title + "\"";
    }

    @Override
    public String printList(String name, List<String> items) {
        String jsonItems = "";
        for (int i = 0; i < items.size(); i++) {
            while (i < items.size()) {
                jsonItems += "\"" + items.get(i) + "\",";
                i++;
            }
            if (i == items.size()) {
                jsonItems = jsonItems.substring(0, jsonItems.length() - 1);
            }
        }
        return "\"" + name + "\":" + "[" + jsonItems + "]";
    }

    @Override
    public String printTotal(String total) {
        return "\"" + total + "\"";
    }

    @Override
    public String printEnd() {
        return "}";
    }
}
