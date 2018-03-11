package factory.abstra;

import factory.Product;
import factory.func.NeccTeamFactory;
import factory.func.UNengliTeamFactory;

/**
 * @author jim
 * @create 2018-03-11 15:27
 **/
public class ProductFactoryImpl  extends  ProductFactory{
    Product getUnnegli() {
        return new UNengliTeamFactory().getProduct();
    }
    Product getNecc() {
        return new NeccTeamFactory().getProduct();
    }
}
