package singleton.Hungry;

/**
 * @author jim
 * @create 2018-03-11 15:52
 **/

/**
 * 1、线程安全-静态变量初始化对象
 * 2、缺点：如果没有用户使用该单例对象，那么就存在资源的浪费
 */
public class China {
    private China(){}
    private static final China china = new China();
    public static final China getInstance(){
        return china;
    }
}
