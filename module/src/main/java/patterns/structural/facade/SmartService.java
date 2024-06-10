package patterns.structural.facade;

import patterns.structural.facade.application.AppCategory;
import patterns.structural.facade.application.Application;
import patterns.structural.facade.gallery.Photo;
import patterns.structural.facade.gallery.Video;
import patterns.structural.facade.gallery.VideoQuality;
import patterns.structural.facade.management.ApplicationManagement;
import patterns.structural.facade.management.PhotoManagement;
import patterns.structural.facade.management.VideoManagement;

//facade
public class SmartService {
    private ApplicationManagement applicationManagement = new ApplicationManagement();
    private VideoManagement videoManagement = new VideoManagement();
    private PhotoManagement photoManagement = new PhotoManagement();

    public void applicationService(String app, AppCategory category) {
        Application application = new Application(app, category);
        applicationManagement.download(application);
        showProperties(applicationManagement.getProperties(application));
    }

    public void videoService(String name, VideoQuality quality, float duration) {
        Video video = new Video(name, quality, duration);
        videoManagement.download(video);
        showProperties(videoManagement.getProperties(video));
    }

    public void photoService(String name, int width, int height) {
        Photo photo = new Photo(name, width, height);
        photoManagement.download(photo);
        showProperties(photoManagement.getProperties(photo));
    }

    private void showProperties(String properties) {
        System.out.println(properties);
    }
}
