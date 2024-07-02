package patterns.behavioral.state.states;

import patterns.behavioral.state.State;
import patterns.behavioral.state.StatusCode;

import java.util.logging.Logger;

public class BadRequest implements State {
    private static final Logger LOGGER = Logger.getLogger(BadRequest.class.getName());

    private final static StatusCode badRequest = StatusCode.BAD_REQUEST_400;

    @Override
    public StatusCode getStatusCode() {
        LOGGER.info("The server cannot process the request");
        return badRequest;
    }
}
