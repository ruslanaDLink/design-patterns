package patterns.behavioral.state;

import patterns.behavioral.state.states.BadRequest;
import patterns.behavioral.state.states.Forbidden;
import patterns.behavioral.state.states.NotFound;
import patterns.behavioral.state.states.Ok;
import patterns.behavioral.state.states.ServerError;

import java.net.URL;
import java.util.logging.Logger;

//main class - performs action depending on object's state
public class Webpage {
    private static final Logger LOGGER = Logger.getLogger(Webpage.class.getName());
    private URL url;
    private State state;
    private final String attemptMessage;

    public Webpage(URL url) {
        this.url = url;
        state = null;
        attemptMessage = "Attempt to access webpage " + getUrl();
    }

    public StatusCode badRequest() {
        LOGGER.info(attemptMessage);
        state = new BadRequest();
        return state.getStatusCode();
    }

    public StatusCode loaded() {
        LOGGER.info(attemptMessage);
        state = new Ok();
        return state.getStatusCode();
    }

    public StatusCode notFound() {
        LOGGER.info(attemptMessage);
        state = new NotFound();
        return state.getStatusCode();
    }

    public StatusCode permittedAccess() {
        LOGGER.info(attemptMessage);
        state = new Forbidden();
        return state.getStatusCode();
    }

    public StatusCode serverError() {
        LOGGER.info(attemptMessage);
        state = new ServerError();
        return state.getStatusCode();
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }
}
