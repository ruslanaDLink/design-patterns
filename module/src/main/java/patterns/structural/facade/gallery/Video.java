package patterns.structural.facade.gallery;

import patterns.structural.facade.util.UtilClass;

public class Video {
    private UtilClass utilClass = new UtilClass();
    private String name;
    private VideoQuality quality;
    private float durationInSec;
    private Double mb;
    private Double kb;

    public Video(String name, VideoQuality quality, float duration) {
        this.name = name;
        this.quality = quality;
        this.durationInSec = duration;
        mb = utilClass.countVideoMb(quality, duration);
        kb = mb * 1024;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VideoQuality getQuality() {
        return quality;
    }

    public void setQuality(VideoQuality quality) {
        this.quality = quality;
    }

    public float getDuration() {
        return durationInSec;
    }

    public void setDuration(float duration) {
        this.durationInSec = duration;
    }

    public Double getMb() {
        return mb;
    }

    public Double getKb() {
        return kb;
    }
}
