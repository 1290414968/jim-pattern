package proxy.jdk;

import proxy.staticproxy.Person;

public class Jim implements Person {
    @Override
    public void getJob() {
        System.out.println("100k");
        System.out.println("一线架构师");
    }
}
