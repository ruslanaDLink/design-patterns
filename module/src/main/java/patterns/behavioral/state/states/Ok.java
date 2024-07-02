package patterns.behavioral.state.states;

import patterns.behavioral.state.State;
import patterns.behavioral.state.StatusCode;

import java.util.logging.Logger;

public class Ok implements State {
    private static final Logger LOGGER = Logger.getLogger(Ok.class.getName());

    private final static StatusCode ok = StatusCode.OK_200;

    @Override
    public StatusCode getStatusCode() {
        LOGGER.info("Successful request");
        return ok;
    }
}
