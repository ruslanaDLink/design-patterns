package patterns.simplefactory.base;

import patterns.simplefactory.SocialNetwork;

import java.net.URI;
import java.net.URISyntaxException;

public class Instagram extends SocialNetwork {

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public URI getLink() throws URISyntaxException {
        return super.getLink();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setLink(URI link) throws URISyntaxException {
        super.setLink(link);
    }
}
