package factory.func;

import factory.Necc;
import factory.Product;

/**
 * @author jim
 * @create 2018-03-11 15:19
 **/
public class NeccTeamFactory  implements ProductFactory {
    public Product getProduct() {
        return new Necc();
    }
}
