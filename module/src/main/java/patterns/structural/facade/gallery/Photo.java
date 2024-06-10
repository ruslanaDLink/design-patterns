package patterns.structural.facade.gallery;

import patterns.structural.facade.util.UtilClass;

import java.time.LocalDateTime;

public class Photo {
    private UtilClass utilClass = new UtilClass();
    private String name;
    private int width;
    private int height;
    private LocalDateTime dateTime;
    private Double mb;
    private Double kb;

    public Photo(String name, int width, int height) {
        int bytePerPixel = 3;
        this.name = name;
        this.width = width;
        this.height = height;
        dateTime = LocalDateTime.now();

        kb = utilClass.minimizeNumbersAfterDot((double) ((width * height * bytePerPixel) / 8) / 1024);
        mb = utilClass.minimizeNumbersAfterDot(kb / 1024);
    }

    public Double getMb() {
        return mb;
    }

    public Double getKb() {
        return kb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
