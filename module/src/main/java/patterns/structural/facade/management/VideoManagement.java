package patterns.structural.facade.management;

import patterns.structural.facade.SmartManager;
import patterns.structural.facade.gallery.Video;

public class VideoManagement implements SmartManager<Video> {

    @Override
    public void download(Video video) {
        System.out.println("Downloaded video " + video.getName());
    }

    @Override
    public String getProperties(Video video) {
        return "Video{" +
                "\n" + "name=" + video.getName() +
                "\n" + "quality=" + video.getQuality() +
                "\n" + "duration in seconds=" + video.getDuration() +
                "\n" + "MB=" + video.getMb() +
                "\n" + "KB=" + video.getKb() +
                "\n" + '}';
    }
}

