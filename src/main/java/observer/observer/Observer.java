package observer.observer;

import observer.event.Event;

import java.util.EventListener;

public class Observer implements EventListener {
    public void add(Event e){
        System.out.println("添加之后的响应");
    }
    public void delete(Event e){
        System.out.println("删除之后的响应");
    }
}
