package patterns.creational.simplefactory;

import patterns.creational.simplefactory.base.Facebook;
import patterns.creational.simplefactory.base.Instagram;
import patterns.creational.simplefactory.base.Snapchat;
import patterns.creational.simplefactory.base.Twitter;

import java.net.URI;
import java.net.URISyntaxException;

public class NetworkFactory {
    private static final URI TWITTER_URI = URI.create("https://x.com/");
    private static final URI SNAPCHAT_URI = URI.create("https://www.snapchat.com/");
    private static final URI INSTAGRAM_URI = URI.create("https://www.instagram.com/");
    private static final URI FACEBOOK_URI = URI.create("https://www.facebook.com/");

    public SocialNetwork getSocialNetwork(Network network) throws URISyntaxException {
        switch (network) {
            case TWITTER -> {
                Twitter twitter = new Twitter();
                twitter.setName(String.valueOf(Network.TWITTER));
                twitter.setLink(TWITTER_URI);
                return twitter;
            }
            case FACEBOOK -> {
                Facebook facebook = new Facebook();
                facebook.setName(String.valueOf(Network.FACEBOOK));
                facebook.setLink(FACEBOOK_URI);
                return facebook;
            }
            case SNAPCHAT -> {
                Snapchat snapchat = new Snapchat();
                snapchat.setName(String.valueOf(Network.SNAPCHAT));
                snapchat.setLink(SNAPCHAT_URI);
                return snapchat;
            }
            case INSTAGRAM -> {
                Instagram instagram = new Instagram();
                instagram.setName(String.valueOf(Network.INSTAGRAM));
                instagram.setLink(INSTAGRAM_URI);
                return instagram;
            }
            default -> throw new IllegalArgumentException("Network is not found " + network);
        }
    }
}
