package proxy.custom;

import proxy.staticproxy.Person;

public class StartBusinessTest {
    public static void main(String[] args) {
        Person person = (Person) new StartBusiness().getInstance(new Jim());
        person.getJob();
    }


}
