package observer.observer;

import observer.event.Event;

import java.lang.reflect.Method;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer = new Observer();
        try {
            Method addMethod = Observer.class.getMethod("add", Event.class);
            subject.addListener(SubjectType.ADD,observer,addMethod);
            subject.add();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
