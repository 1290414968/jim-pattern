package observer.proxy;

public class Mouse implements ActionInterface {
    @Override
    public void onClick() {
        System.out.println("触发了鼠标点击事件");
    }
    @Override
    public void onDoubleClick() {
        System.out.println("触发了鼠标双击事件");
    }
}
