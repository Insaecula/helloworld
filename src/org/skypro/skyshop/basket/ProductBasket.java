package org.skypro.skyshop.basket;

import java.util.*;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Map<String, List<Product>> productsMap;

    public ProductBasket() {
        productsMap = new HashMap<>();
    }


    public void addProduct(Product product) {
        productsMap.computeIfAbsent(product.getName(), k -> new ArrayList<>()).add(product);
    }

    public List<Product> getProductsByName(String name) {
        return productsMap.getOrDefault(name, Collections.emptyList());
    }

    public List<Product> removeProductByName(String name) {
        productsMap.remove(name);
        return List.of();
    }

    public void printBasket() {
        for (List<Product> productList : productsMap.values()) {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }
}


