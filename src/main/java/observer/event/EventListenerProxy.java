package observer.event;

import observer.mouse.MouseCallInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class EventListenerProxy implements InvocationHandler {
    private MouseCallInterface mouseCallInterface;
    public EventListenerProxy(MouseCallInterface mouseCallInterface) {
        this.mouseCallInterface = mouseCallInterface;
    }
    public Object getInstance(){
        Object object = Proxy.newProxyInstance(mouseCallInterface.getClass().getClassLoader(),mouseCallInterface.getClass().getInterfaces(),this);
        return object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = method.invoke(mouseCallInterface,args);
        return object;
    }
}
