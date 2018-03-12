package singleton.Lazy;
/**
 * @author jim
 * @create 2018-03-11 15:56
 **/
/**
 * 懒汉：
 * 1、当不存在反射构造创建的时候，是线程安全的单例
 * 2、避免线程安全的方式为在getInstance()之前，在外部类被调用的时候内部类才会被加载
 内部类一定是要在方法调用之前初始化
 巧妙地避免了线程安全问题
 这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
 3、initalized的变量必须是静态的防止反射重复实例化
 */
public class LazyChina {
    private static boolean initalized =  false;
    private LazyChina()  {
        synchronized (LazyChina.class){
            if(initalized==false){
                initalized = !initalized;
            }else{
                throw new RuntimeException("单例已实例化，被侵犯");
            }
        }
    }
    public final static LazyChina getInstance(){
        return LazyHolder.LAZY_CHINA;
    }
    private static class LazyHolder{
        private static final LazyChina LAZY_CHINA = new LazyChina();
    }
}
