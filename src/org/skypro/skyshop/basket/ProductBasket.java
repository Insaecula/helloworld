package org.skypro.skyshop.basket;
import java.util.ArrayList;
import java.util.List;
import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final List<Product> products;

    public ProductBasket() {
        this.products = new ArrayList<>();
    }


    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
        } else {
            System.out.println("Ошибка: Нельзя добавить null-продукт.");
        }
    }


    public List<Product> removeProductByName(String name) {
        List<Product> removedProducts = new ArrayList<>();
        products.removeIf(product -> {
            if (product.getName().equals(name)) {
                removedProducts.add(product);
                return true;
            }
            return false;
        });
        return removedProducts;
    }


    public boolean containsProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }


    public void clearBasket() {
        products.clear();
    }


    public void printBasket() {
        if (products.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }

        System.out.println("Товары в корзине:");
        int specialCount = 0;
        double totalCost = 0;

        for (Product product : products) {
            if (product.isSpecial()) {
                specialCount++;
            }
            totalCost += product.getPrice();
            System.out.println("- " + product.getName() + " | Цена: " + product.getPrice());
        }

        System.out.println("Итого: " + totalCost);
        System.out.println("Специальных товаров: " + specialCount);
    }
}
