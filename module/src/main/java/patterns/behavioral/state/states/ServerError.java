package patterns.behavioral.state.states;

import patterns.behavioral.state.State;
import patterns.behavioral.state.StatusCode;

import java.util.logging.Logger;

public class ServerError implements State {
    private static final Logger LOGGER = Logger.getLogger(ServerError.class.getName());

    private final static StatusCode serverError = StatusCode.INTERNAL_SERVER_ERROR_500;

    @Override
    public StatusCode getStatusCode() {
        LOGGER.info("Unexpected condition was encountered");
        return serverError;
    }
}
