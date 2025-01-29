package org.skypro.skyshop;
import java.util.ArrayList;
import java.util.List;

import org.skypro.skyshop.Exception.BestResultNotFound;
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
        ProductBasket basket = new ProductBasket();
        List<Searchable> items = new ArrayList<>();

        try {
            Product product1 = new SimpleProduct("   ", 20);  // Неправильное название
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            Product product2 = new SimpleProduct("Ноутбук", -10);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            Product product3 = new DiscountProduct("Телефон", 100, 150);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            Product product4 = new DiscountProduct("Таблетка", 200, 50);
            System.out.println("Продукт создан: " + product4.getName());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        List<Product> removedProducts = basket.removeProductByName("Яблоко");
        System.out.println("\nУдаленные продукты:");
        removedProducts.forEach(p -> System.out.println("- " + p.getName()));
        System.out.println("\nСодержимое корзины после удаления:");
        basket.printBasket();

        List<Product> removedNonExistent = basket.removeProductByName("Товар 4");
        if (removedNonExistent.isEmpty()) {
            System.out.println("\nСписок пуст");
        }

        SearchEngine searchEngine = new SearchEngine();
        items = new ArrayList<>();
        items.add(() -> "Apple pie");
        items.add(() -> "Banana smoothie");
        items.add(() -> "Green apple");
        items.add(() -> "Grape juice");
        try {
            List<Searchable> results = searchEngine.findBestMatches("Яблоко", items);
            System.out.println("\nНайденные результаты поиска:");
            results.forEach(r -> System.out.println("- " + r.getSearchTerm()));
        } catch (BestResultNotFound e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            List<Searchable> noResults = searchEngine.findBestMatches("Вишня", items);
            System.out.println("\nНайденные результаты поиска:");
            noResults.forEach(r -> System.out.println("- " + r.getSearchTerm()));
        } catch (BestResultNotFound e) {
            System.out.println("Ошибка: " + e.getMessage());


            Product product1 = new SimpleProduct("Товар 1", 100);
            Product product2 = new DiscountProduct("Товар 2", 200, 20);
            Product product3 = new FixPriceProduct("Товар 3");


            basket = new ProductBasket();
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
            System.out.println("\nРезультаты поиска:");
            for (Searchable item : results) {
                if (item != null) {
                    System.out.println("- " + item.getSearchTerm());

            basket.printBasket();


            System.out.println("Есть ли товар 'Товар 1' в корзине? " + basket.containsProduct("Товар 1"));
            System.out.println("Есть ли товар 'Товар 4' в корзине? " + basket.containsProduct("Товар 4"));


            basket.clearBasket();


                    basket.clearBasket();
                    System.out.println("\nКорзина после очистки:");
                    basket.printBasket();
                }
            }
        }
    }
}
