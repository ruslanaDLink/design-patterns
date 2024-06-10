package patterns.structural.facade.application;

import patterns.structural.facade.util.UtilClass;

public class Application {
    private UtilClass utilClass = new UtilClass();
    private String name;
    private AppCategory category;
    private Double mb;
    private Double kb;

    public Application(String name, AppCategory category) {
        this.name = name;
        this.category = category;
        mb = utilClass.averageAppSize();
        kb = utilClass.minimizeNumbersAfterDot(mb * 1024);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppCategory getCategory() {
        return category;
    }

    public void setCategory(AppCategory category) {
        this.category = category;
    }

    public Double getMb() {
        return mb;
    }

    public Double getKb() {
        return kb;
    }
}
