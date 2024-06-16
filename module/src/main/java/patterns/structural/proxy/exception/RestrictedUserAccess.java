package patterns.structural.proxy.exception;

public class RestrictedUserAccess extends Exception {

    public RestrictedUserAccess() {
        System.out.println("ACCESS DENIED.");
    }
}
