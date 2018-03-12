package singleton.register;

import java.util.concurrent.CountDownLatch;

/**
 * @author jim
 * @create 2018-03-11 15:56
 **/
public class Test {
    public static void main(String[] args) {
        int count = 1000;
        final CountDownLatch latch = new CountDownLatch(count);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {

                        try {
                            // 阻塞
                            // count = 0 就会释放所有的共享锁
                            // 万箭齐发
                            latch.await();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        Object china = ChinaMap.getInstance("singleton.register.China");
                        System.out.println(System.currentTimeMillis() + ":" + china);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start(); //每循环一次，就启动一个线程,具有一定的随机性
            latch.countDown();
        }
        long end = System.currentTimeMillis();

        System.out.println("总耗时：" + (end - start));
    }
}
