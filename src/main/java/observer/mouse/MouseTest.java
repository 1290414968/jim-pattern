package observer.mouse;

import observer.event.Event;
import observer.event.EventType;

import java.lang.reflect.Method;

public class MouseTest {
    public static void main(String[] args) throws NoSuchMethodException {
        /**
         * 1、Mouse对象是一个被观察对象，继承自监听器对象，当方法被调用时，触发监听器事件响应方法
         * 2、监听器对象维护一个监听事件的容器，可以向监听器对象上添加监听事件
         * 3、监听器对象拥有触发事件响应方法
         */
        Mouse mouse = new Mouse();
        /**
         * 3、MouseCallBack对象是一个观察对象，观察对象的方法在被观察对象的事件被触发时调用
         */
        MouseCallBack callBack = new MouseCallBack();
        Method onClick = MouseCallBack.class.getMethod("onClick", Event.class);

        /**
         * 抽象思路
         * 1、事件对象
         *    事件的被观察者
         *    事件的观察者
         *    事件的观察者的回调方法
         *    事件的执行时间
         *    事件的类型
         * 2、事件类型对象-枚举
         * 3、被观察者对象
         *    被观察的方法
         * 4、被观察者和观察者联系对象-监听器对象
         *    1）、当被观察者对象的方法被触发时，观察者对象的方法如何被调用到
         *    2）、监听器对象维护事件对象容器，从事件容器中取出对应的事件对象，回调事件对象上的被观察者对象
         *    3）、被观察对象继承监听器对象
         * 5、观察者对象
         */

        mouse.addListener(EventType.CLICK,callBack,onClick);
        mouse.click();

    }
}
