package proxy.jdk;

import proxy.staticproxy.Person;

public class BatTest {
    public static void main(String[] args) {
        Bat bat = new Bat();
        Person jim = (Person) bat.getInstance(new Jim());
        jim.getJob();
    }
}
