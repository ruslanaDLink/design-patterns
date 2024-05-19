package patterns.creational.simplefactory;

import java.net.URI;
import java.net.URISyntaxException;

public abstract class SocialNetwork {
    private String name;
    private URI link;

    public String getName() {
        return name;
    }

    public URI getLink() throws URISyntaxException {
        return link;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLink(URI link) throws URISyntaxException {
        this.link = link;
    }
}
