package patterns.structural.proxy.dynamicproxy;

import patterns.structural.proxy.AccessControl;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    public static AccessControl getProxyAccess() {
        return (AccessControl) Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(), new Class[]{AccessControl.class},
                new AccessHandler());
    }
}
