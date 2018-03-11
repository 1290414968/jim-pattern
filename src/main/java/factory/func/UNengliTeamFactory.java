package factory.func;

import factory.Product;
import factory.UNengli;

/**
 * @author jim
 * @create 2018-03-11 15:22
 **/
public class UNengliTeamFactory implements ProductFactory {
    public Product getProduct() {
        return new UNengli();
    }
}
