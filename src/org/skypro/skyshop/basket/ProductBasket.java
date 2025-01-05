package org.skypro.skyshop.basket;


import org.skypro.skyshop.product.Product;



public class ProductBasket {
    private Product[] products = new Product[5];
    private int productCount = 0;


    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount++] = product;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }


    public int getTotalCost() {
        int totalCost = 0;
        for (int i = 0; i < productCount; i++) {
            totalCost += products[i].getPrice();
        }
        return totalCost;
    }


    public void printBasket() {
        if (productCount == 0) {
            System.out.println("В корзине пусто");
            return;
        }

        int specialCount = 0;

        for (int i = 0; i < productCount; i++) {
            Product product = products[i];
            if (product.isSpecial()) {
                specialCount++;
            }
            System.out.println(product);
        }

        System.out.println("Итого: " + getTotalCost());
        System.out.println("Специальных товаров: " + specialCount);
    }


    public boolean containsProduct(String name) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }


    public void clearBasket() {
        products = new Product[5];
        productCount = 0;
    }
}

