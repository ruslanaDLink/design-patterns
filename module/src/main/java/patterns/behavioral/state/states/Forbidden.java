package patterns.behavioral.state.states;

import patterns.behavioral.state.State;
import patterns.behavioral.state.StatusCode;

import java.util.logging.Logger;

public class Forbidden implements State {
    private static final Logger LOGGER = Logger.getLogger(Forbidden.class.getName());

    private final static StatusCode forbidden = StatusCode.FORBIDDEN_403;

    @Override
    public StatusCode getStatusCode() {
        LOGGER.info("There are no required permissions for a resource");
        return forbidden;
    }
}
