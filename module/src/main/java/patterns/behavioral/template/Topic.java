package patterns.behavioral.template;

import java.util.List;

public class Topic {
    private String header;
    private String title;
    private String listName;
    private List<String> items;
    private String total;

    public Topic( String title, String header, String listName, List<String> items, String total) {
        this.header = header;
        this.title = title;
        this.listName = listName;
        this.items = items;
        this.total = total;
    }

    public Topic(String header, String title, String total) {
        this.header = header;
        this.title = title;
        this.total = total;
    }


    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
