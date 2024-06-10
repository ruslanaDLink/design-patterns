package patterns.structural.facade.management;

import patterns.structural.facade.SmartManager;
import patterns.structural.facade.gallery.Photo;

public class PhotoManagement implements SmartManager<Photo> {

    @Override
    public void download(Photo photo) {
        System.out.println("Downloaded photo " + photo.getName());
    }

    @Override
    public String getProperties(Photo photo) {
        return "Photo{" +
                "\n" + "name=" + photo.getName() +
                "\n" + "width=" + photo.getWidth() +
                "\n" + "height=" + photo.getHeight() +
                "\n" + "date=" + photo.getDateTime() +
                "\n" + "KB=" + photo.getKb() +
                "\n" + "MB=" + photo.getMb() +
                "\n" +  '}';
    }

}
