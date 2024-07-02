package patterns.behavioral.state.states;

import patterns.behavioral.state.State;
import patterns.behavioral.state.StatusCode;

import java.util.logging.Logger;

public class NotFound implements State {
    private static final Logger LOGGER = Logger.getLogger(NotFound.class.getName());

    private final static StatusCode notFound = StatusCode.NOT_FOUND_404;

    @Override
    public StatusCode getStatusCode() {
        LOGGER.info("Resource could not be found");
        return notFound;
    }
}
