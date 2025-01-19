package org.skypro.skyshop;



import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.product.DiscountProduct;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        try {
            Product product1 = new SimpleProduct("   ", 20);  // Неправильное название
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            Product product2 = new SimpleProduct("Laptop", -10);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            Product product3 = new DiscountProduct("Phone", 100, 150);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            Product product4 = new DiscountProduct("Tablet", 200, 50);
            System.out.println("Продукт создан: " + product4.getName());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        SearchEngine searchEngine = new SearchEngine(10);


        Product product1 = new SimpleProduct("Товар 1", 100);
        Product product2 = new DiscountProduct("Товар 2", 200, 20);
        Product product3 = new FixPriceProduct("Товар 3");


        ProductBasket basket = new ProductBasket();
        Article article1 = new Article("Ноутбук", "Это хороший ноутбук");
        Article article2 = new Article("Телефон", "Лучший телефон в этом году ");


        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        searchEngine.add(product1);
        searchEngine.add(product2);
        searchEngine.add(product3);
        searchEngine.add(article1);
        searchEngine.add(article2);

        Searchable[] results = searchEngine.search("Ноутбук");
        basket.printBasket();


        System.out.println("Общая стоимость корзины: " + basket.getTotalCost());


        System.out.println("Есть ли товар 'Товар 1' в корзине? " + basket.containsProduct("Товар 1"));
        System.out.println("Есть ли товар 'Товар 4' в корзине? " + basket.containsProduct("Товар 4"));


        basket.clearBasket();


        basket.printBasket();
        for (Searchable item : results) {
            if (item != null) {
                System.out.println(item.getStringRepresentation());
            }
        }
    }
}
