package singleton.Lazy;
/**
 * @author jim
 * @create 2018-03-11 15:56
 **/
/**
 * 线程
 */
public class LazyChina {
    private static LazyChina lazyChina;
    private LazyChina(){}
    public static LazyChina getLazyChina(){
        if(lazyChina==null){
            lazyChina = new LazyChina();
        }
        return lazyChina;
    }
}
