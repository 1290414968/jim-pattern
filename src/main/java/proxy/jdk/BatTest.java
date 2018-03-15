package proxy.jdk;

import proxy.staticproxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class BatTest {
    public static void main(String[] args) {
        Bat bat = new Bat();
        Person jim = (Person) bat.getInstance(new Jim());
        jim.getJob();

        //将Proxy.newInstance()方法返回的Proxy对象进行字节码文件生成
        try {
            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
