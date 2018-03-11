package factory.func;

import factory.Product;

/**
 * @author jim
 * @create 2018-03-11 15:23
 **/
public class Test {
    public static void main(String[] args) {
        ProductFactory factory = new NeccTeamFactory();
        Product product = factory.getProduct();
        System.out.println(product.toString());
        factory = new UNengliTeamFactory();
        product = factory.getProduct();
        System.out.println(product.toString());
    }
}
