package proxy.custom;

import proxy.staticproxy.Person;

import java.lang.reflect.Method;

public class StartBusiness implements MyInvocationHandler {
    private Person person;
    public  Object getInstance(Person person){
        this.person = person;
        Class clazz =  person.getClass();
        Object object = MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
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
