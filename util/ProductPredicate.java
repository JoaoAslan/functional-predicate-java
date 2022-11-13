package aula3.util;

import aula3.entities.Product;

import java.util.function.Predicate;

// https://docs.oracle.com/javase/10/docs/api/java/util/function/Predicate.html
public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0;
    }
}
