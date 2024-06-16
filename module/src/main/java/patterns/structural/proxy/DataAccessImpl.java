package patterns.structural.proxy;

import patterns.structural.proxy.exception.RestrictedUserAccess;

import java.util.Date;
import java.util.logging.Logger;

public class DataAccessImpl implements AccessControl {
    private static final Logger LOGGER = Logger.getLogger(DataAccessImpl.class.getName());

    @Override
    public String getAccessToData(String username, String psw) throws RestrictedUserAccess {
        LOGGER.warning(username + " tried get access to data " + new Date());
        throw new RestrictedUserAccess();
    }
}
