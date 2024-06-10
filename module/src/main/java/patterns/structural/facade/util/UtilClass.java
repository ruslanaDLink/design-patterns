package patterns.structural.facade.util;

import patterns.structural.facade.gallery.VideoQuality;

import java.util.Random;

public class UtilClass {
    private static final int BITRATE_FOR_144 = 100;
    private static final int BITRATE_FOR_240 = 300;
    private static final int BITRATE_FOR_360 = 500;
    private static final int BITRATE_FOR_480 = 1000;
    private static final int BITRATE_FOR_720 = 1500;
    private static final int BITRATE_FOR_1080 = 3000;


    public Double countVideoMb(VideoQuality quality, float duration) {
        double mb = 0.0;

        if (quality == VideoQuality.p144) {
            mb = ((double) BITRATE_FOR_144 / 8) * duration / 1024;
        } else if (quality == VideoQuality.p240) {
            mb = ((double) BITRATE_FOR_240 / 8) * duration / 1024;
        } else if (quality == VideoQuality.p360) {
            mb = ((double) BITRATE_FOR_360 / 8) * duration / 1024;
        } else if (quality == VideoQuality.p480) {
            mb = ((double) BITRATE_FOR_480 / 8) * duration / 1024;
        } else if (quality == VideoQuality.p720) {
            mb = ((double) BITRATE_FOR_720 / 8) * duration / 1024;
        } else if (quality == VideoQuality.p1080) {
            mb = (double) BITRATE_FOR_1080 / 8 * duration / 1024;
        }
        return minimizeNumbersAfterDot(mb);
    }

    public Double averageAppSize() {
        double nextDouble = new Random().nextDouble(10, 70);
        return minimizeNumbersAfterDot(nextDouble);
    }

    public Double minimizeNumbersAfterDot(Double number){
        number = number * Math.pow(10, 1);
        number = Math.floor(number);
        return number / Math.pow(10, 1);
    }
}
