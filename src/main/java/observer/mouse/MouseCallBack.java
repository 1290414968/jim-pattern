package observer.mouse;

import observer.event.Event;

public class MouseCallBack implements  MouseCallInterface {
    public void onClick(Event e){
        System.out.println("鼠标点击之后响应......."+e);
    }
    public void onDoubleClick(Event e){
        System.out.println("鼠标双击之后响应......."+e);
    }
}
