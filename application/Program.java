package aula3.application;

import aula3.entities.Product;
import aula3.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.5));
        list.add(new Product("HD Case", 80.9));

        // DISPONIBILIZANDO:
        Double min = 100.0;

        Predicate<Product> pred = p -> p.getPrice() >= min;

        list.removeIf(pred);

        for (Product p : list) {
            System.out.println(p);
        }

    }
}
