package factory;
/**
 * @author jim
 * @create 2018-03-11 15:08
 **/
public class Product {
    String name;
    Long startDevelopDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStartDevelopDate() {
        return startDevelopDate;
    }

    public void setStartDevelopDate(Long startDevelopDate) {
        this.startDevelopDate = startDevelopDate;
    }

    @Override
    public String toString() {
        return name+":"+startDevelopDate;
    }
}
