package observer.observer;

import observer.event.EventListener;

public class Subject extends EventListener {
    public void add(){
        System.out.println("触发了添加事件");
        this.trigger(SubjectType.ADD);
    }
    public void delete(){
        System.out.println("触发了删除事件");
        this.trigger(SubjectType.DELETE);
    }
}
