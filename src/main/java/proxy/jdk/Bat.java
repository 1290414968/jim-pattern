package proxy.jdk;

import proxy.staticproxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 1、InvocationHandler持有被代理对象的引用，使用getInstance()方法将具体的被代理对象引用传递进来
 * 2、getInstance()方法根据Person接口，重新生成实现了Person接口的$Proxy的实现类的对象
 * 3、InvocationHandler对象调用invoke()方法时，调用了被代理对象的方法
 */
public class Bat implements InvocationHandler {
    private Person person;
    public  Object getInstance(Person person){
        this.person = person;
        Class clazz =  person.getClass();
        Object object =   Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
        return object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("匹配优秀公司");
        Object obj =  method.invoke(this.person,args);
        System.out.println("面试");
        return obj;
    }
}
