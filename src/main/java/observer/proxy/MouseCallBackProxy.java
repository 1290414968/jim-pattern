package observer.proxy;

import observer.event.EventListener;
import observer.event.EventType;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MouseCallBackProxy extends EventListener implements InvocationHandler  {

    private ActionInterface actionInterface;

    public MouseCallBackProxy(ActionInterface actionInterface) {
        this.actionInterface = actionInterface;
    }
    public ActionInterface getInstance(){
        Class clazz = this.actionInterface.getClass();
        ActionInterface object = (ActionInterface)Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
        return object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(actionInterface,args);
        String methodName = method.getName();
        //继承使用方法调用，或者使用if判断去调用观察者的方法
        trigger(EventType.valueOf(methodName));
        return null;
    }

}
