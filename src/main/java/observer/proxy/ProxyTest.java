package observer.proxy;

import observer.event.Event;
import observer.event.EventType;
import observer.mouse.MouseCallBack;

import java.lang.reflect.Method;

public class ProxyTest {
    public static void main(String[] args) throws NoSuchMethodException {
        ActionInterface mouse = new Mouse();
        MouseCallBack callBack = new MouseCallBack();
        Method method = callBack.getClass().getMethod("onClick", Event.class);
        MouseCallBackProxy mouseProxy = new MouseCallBackProxy(mouse);
        mouseProxy.addListener(EventType.onClick,callBack,method);
        ActionInterface proxyInterface =   mouseProxy.getInstance();
        proxyInterface.onClick();
    }
}
