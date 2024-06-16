package patterns.structural.proxy;

import patterns.structural.proxy.exception.RestrictedUserAccess;

//proxy
public class ControlledAccess implements AccessControl {

    @Override
    public String getAccessToData(String username, String psw) throws RestrictedUserAccess {
        if (username.equals("admin")) {
            System.out.println("Welcome, " + username);
            return new DataStorage().printData();
        } else {
            DataAccessImpl dataAccess = new DataAccessImpl();
            dataAccess.getAccessToData(username, psw);
        }
        return null;
    }
}
