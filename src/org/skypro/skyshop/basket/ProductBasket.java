package org.skypro.skyshop.basket;

import java.util.*;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Map<String, List<Product>> products = new HashMap<>();

    public int getTotalPrice() {
        return products.values().stream()
                .flatMap(Collection::stream)
                .mapToInt(Product::getPrice)
                .sum();
    }
    public void printBasket() {
        long specialProductCount = getSpecialCount();

        products.values().stream()
                .flatMap(Collection::stream)
                .forEach(product -> System.out.println(product));

        System.out.println("Итого: " + getTotalPrice());
        System.out.println("Специальных товаров: " + specialProductCount);
    }

    public void addProduct(Product product) {
        products.computeIfAbsent(product.getName(), k -> new ArrayList<>()).add(product);
    }

    public List<Product> getProductsByName(String name) {
        return products.getOrDefault(name, Collections.emptyList());
    }

    public List<Product> removeProductByName(String name) {
        products.remove(name);
        return List.of();
    }




    public void clearBasket() {
    }
    private long getSpecialCount() {
        return products.values().stream()
                .flatMap(Collection::stream)
                .filter(Product::isSpecial)
                .count();
    }


    public String addProduct(String телевизор) {
        return null;
    }
}


