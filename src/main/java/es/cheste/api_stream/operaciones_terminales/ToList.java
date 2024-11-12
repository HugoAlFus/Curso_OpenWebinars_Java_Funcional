package es.cheste.api_stream.operaciones_terminales;

import es.cheste.api_stream.operaciones_intermedias.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToList {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("product1", 9.99));
        products.add(new Product("product2", 19.99));
        products.add(new Product("product3", 29.99));
        products.add(new Product("product4", 39.99));
        products.add(new Product("product5", 49.99));

        List<Double> prices = products.stream()
                .map(product -> product.getPrice())
                .filter(price -> price > 10)
                .toList();
        System.out.println(prices);

        List<Double> prices2 = products.stream()
                .map(product -> product.getPrice())
                .filter(price -> price > 10)
                .collect(Collectors.toList());
    }
}
