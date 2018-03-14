package proxy.staticproxy;

public class LieTou {
    private Person person;

    public LieTou(Person person) {
        this.person = person;
    }
    void findJob(){
        System.out.println("匹配优秀公司");
        person.getJob();
        System.out.println("面试");
    }
}
