package patterns.structural.proxy;

import patterns.structural.proxy.exception.RestrictedUserAccess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProxyUserDemo {
    public static void main(String[] args) throws IOException, RestrictedUserAccess {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER USERNAME:");
        String username = bufferedReader.readLine();
        System.out.println("ENTER PASSWORD:");
        String password = bufferedReader.readLine();

        AccessControl accessControl = new ControlledAccess();
        String attemptToAccess = accessControl.getAccessToData(username, password);
        System.out.println(attemptToAccess);
    }
}
