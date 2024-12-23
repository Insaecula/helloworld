package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;


import org.skypro.skyshop.product.Product;


public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Яблоко", 70);
        Product product2 = new Product("Банан", 75);
        Product product3 = new Product("Клубника", 100);
        Product product4 = new Product("Апельсин", 90);
        Product product5 = new Product("Ананас", 200);
        Product product6 = new Product("Манго", 250);

        ProductBasket basket = new ProductBasket();
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);
        //basket.addProduct(product6);
        basket.printBasketContents();
        //
        System.out.println("Общая стоимость: " + basket.getTotalCost());
        System.out.println("Есть ли продукт 'Яблоко': " + basket.containsProduct("Яблоко"));
        System.out.println("Есть ли продукт 'Манго': " + basket.containsProduct("Манго"));
        System.out.println("Общая стоимость: " + basket.getTotalCost());
        System.out.println("Есть ли продукт 'Яблоко': " + basket.containsProduct("Яблоко"));
        basket.clearBasket();
        basket.printBasketContents();
    }

}

