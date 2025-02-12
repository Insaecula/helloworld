package org.skypro.skyshop;

import org.skypro.skyshop.Exception.BestResultNotFound;
import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;
import org.skypro.skyshop.basket.ProductBasket;

import java.util.*;

public class App {
    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine();
        ProductBasket basket = new ProductBasket();


        Product product1 = new SimpleProduct("Ноутбук", 1000);
        Product product2 = new DiscountProduct("Телефон", 500, 10);
        Product product3 = new FixPriceProduct("Планшет");
        Article article1 = new Article("Ноутбук", "Это хороший ноутбук");
        Article article2 = new Article("Телефон", "Лучший телефон в этом году");

        searchEngine.add(product1);
        searchEngine.add(product2);
        searchEngine.add(product3);
        searchEngine.add(article1);
        searchEngine.add(article2);

        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);


        Set<Searchable> searchResults = searchEngine.search("Ноутбук");
        System.out.println("\nРезультаты поиска:");
        for (Searchable item : searchResults) {
            System.out.println("- " + item.getSearchTerm());
        }


        System.out.println("\nСодержимое корзины:");
        basket.printBasket();

        System.out.println("Есть ли товар 'Ноутбук' в корзине? " + basket.addProduct("Ноутбук"));
        System.out.println("Есть ли товар 'Телевизор' в корзине? " + basket.addProduct("Телевизор"));


        List<Product> removedProducts = basket.removeProductByName("Телефон");
        System.out.println("\nУдаленные продукты:");
        removedProducts.forEach(p -> System.out.println("- " + p.getName()));

        System.out.println("\nСодержимое корзины после удаления:");
        basket.printBasket();


        basket.clearBasket();
        System.out.println("\nКорзина после очистки:");
        basket.printBasket();


        List<Searchable> items = new ArrayList<>();
        items.add(product1);
        items.add(product2);
        items.add(product3);
        items.add(article1);
        items.add(article2);

        try {
            List<Searchable> bestMatches = searchEngine.findBestMatches("Ноутбук", items);
            System.out.println("\nНайденные результаты поиска:");
            bestMatches.forEach(r -> System.out.println("- " + r.getSearchTerm()));
        } catch (BestResultNotFound e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            List<Searchable> noResults = searchEngine.findBestMatches("Вишня", items);
            System.out.println("\nНайденные результаты поиска:");
            noResults.forEach(r -> System.out.println("- " + r.getSearchTerm()));
        } catch (BestResultNotFound e) {
            System.out.println("Ошибка: " + e.getMessage());
        }


        try {
            Product invalidProduct1 = new SimpleProduct("   ", 20);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            Product invalidProduct2 = new SimpleProduct("Ноутбук", -10);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            Product invalidProduct3 = new DiscountProduct("Телефон", 100, 150);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            Product validProduct = new DiscountProduct("Таблетка", 200, 50);
            System.out.println("Продукт создан: " + validProduct.getName());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}