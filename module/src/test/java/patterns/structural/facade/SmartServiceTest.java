package patterns.structural.facade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import patterns.structural.facade.application.AppCategory;
import patterns.structural.facade.gallery.VideoQuality;


class SmartServiceTest {
    private SmartService smartService;

    @BeforeEach
    void setUp() {
        smartService = new SmartService();
    }

    @Test
    void applicationService() {
        smartService.applicationService("Netflix", AppCategory.ENTERTAINMENT);
    }

    @Test
    void videoService() {
        smartService.videoService("Trip To Mountains", VideoQuality.p480, 60);
    }

    @Test
    void photoService() {
        smartService.photoService("Selfie", 2000, 1500);
    }
}