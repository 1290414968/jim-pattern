package observer.event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 注册Event监听器
 */
public class EventListener {
    protected Map<Enum,Event> eventMap = new HashMap<>();
    public void addListener(Enum eventType){
        eventMap.put(eventType,new Event());
    }
    public void addListener(Enum eventType,Object target,Method callback){
        eventMap.put(eventType,new Event(target,callback));
    }
    protected void trigger(Enum eventType){
        if(!eventMap.containsKey(eventType)){return;}
        Event event =  eventMap.get(eventType);
        event.setTrigger(eventType.toString());
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        try {
            event.getCallback().invoke(event.getTarget(),event);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
