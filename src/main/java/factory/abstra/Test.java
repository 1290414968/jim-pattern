package factory.abstra;

import factory.Product;

/**
 * @author jim
 * @create 2018-03-11 15:23
 **/
public class Test {
    public static void main(String[] args) {
        ProductFactory factory =  new ProductFactoryImpl();
        Product product =factory.getNecc();
        System.out.println(product.toString());
        product = factory.getUnnegli();
        System.out.println(product.toString());
    }
}
