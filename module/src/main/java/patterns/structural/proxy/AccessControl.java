package patterns.structural.proxy;

import patterns.structural.proxy.exception.RestrictedUserAccess;

public interface AccessControl {

    String getAccessToData(String username, String psw) throws RestrictedUserAccess;

}
