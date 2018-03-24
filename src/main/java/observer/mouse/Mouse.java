package observer.mouse;

import observer.event.EventListener;
import observer.event.EventType;

public class Mouse  extends EventListener {

    public void click(){
        System.out.println("鼠标被单击");
        this.trigger(EventType.CLICK);
    }
    public void doubleClick(){
        System.out.println("鼠标被双击");
        this.trigger(EventType.DOUBLE_CLICK);
    }
}
