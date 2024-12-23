package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;


public class ProductBasket {
    private final Product[] products = new Product[5];
    private int count = 0;

    public void addProduct(Product product) {
        if (count >= products.length) {
            System.out.println("Невозможно добавить продукт: корзина заполнена");
            return;
        }
        products[count++] = product;
    }


    public int getTotalCost() {
        int total = 0;
        for (Product product : products) {
            if (product != null) {
                total += product.getPrice();
            }
        }
        return total;
    }


    public void printBasketContents() {
        if (count == 0) {
            System.out.println("в корзине пусто");
            return;
        }
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName() + ": " + product.getPrice());
            }
        }
        System.out.println("Итого: " + getTotalCost());
    }


    public boolean containsProduct(String name) {
        for (Product product : products) {
            if (product != null && product.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }


    public void clearBasket() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
        count = 0;

        products[0] = new Product("Яблоко", 70);
        products[1] = new Product("Банан", 75);
        products[2] = new Product("Клубника", 100);
        products[3] = new Product("Апельсин", 90);
        products[4] = new Product("Ананас", 200);
        // products[5] = new Product("Манго", 250);
    }
}
