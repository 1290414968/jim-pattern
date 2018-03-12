package singleton.Lazy;

import java.lang.reflect.Constructor;

/**
 * @author jim
 * @create 2018-03-11 15:56
 **/
public class Test {
    public static void main(String[] args) {
//        int count = 1000;
//        final CountDownLatch latch = new CountDownLatch(count);
//        long start = System.currentTimeMillis();
//        for(int i=0;i<count;i++){
//            new Thread(){
//                @Override
//                public void run() {
//                    try{
//
//                        try {
//                            // 阻塞
//                            // count = 0 就会释放所有的共享锁
//                            // 万箭齐发
//                            latch.await();
//                        }catch(Exception e){
//                            e.printStackTrace();
//                        }
//                        LazyChina china = LazyChina.getInstance();
//                        System.out.println(System.currentTimeMillis() + ":" + china);
//
//                    }catch (Exception e){
//                        e.printStackTrace();
//                    }
//                }
//            }.start(); //每循环一次，就启动一个线程,具有一定的随机性
//            latch.countDown();
//        }
//        long end = System.currentTimeMillis();
//
//        System.out.println("总耗时：" + (end - start));


        //很无聊的情况下，进行破坏
        Class<?> clazz = LazyChina.class;
        //通过反射拿到私有的构造方法
        Constructor c = null;
        try {
            c = clazz.getDeclaredConstructor(null);
            //强制访问
            c.setAccessible(true);
            //暴力初始化
            Object o1 = c.newInstance();
            System.out.printf(o1.toString());
            //调用了两次构造方法，相当于new了两次
            //犯了原则性问题，
            Object o2 = c.newInstance();
//            System.out.printf(o2.toString());
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
