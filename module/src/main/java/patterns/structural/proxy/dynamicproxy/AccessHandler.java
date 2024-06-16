package patterns.structural.proxy.dynamicproxy;

import patterns.structural.proxy.AccessControl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AccessHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Method getAccessToDataMethod = AccessControl.class.getMethod("getAccessToData", String.class, String.class);
        if (getAccessToDataMethod.equals(method)) {
            String arg = (String) args[0];
            System.out.println("InvocationHandler in action. " + arg);
        }
        return null;
    }
}
