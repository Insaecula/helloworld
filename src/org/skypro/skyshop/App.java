package org.skypro.skyshop;



import org.skypro.skyshop.Article.Article;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.SearchEngine.SearchEngine;
import org.skypro.skyshop.basket.Interface.Searchable;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
//import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine(10);



        Product product1 = new SimpleProduct("Товар 1", 100);
        Product product2 = new DiscountedProduct("Товар 2", 200, 20);
        Product product3 = new FixPriceProduct("Товар 3");
        Product product4 = new Product("Ноутбук" );
        Product product5 = new Product("Телефон" ) ;
        Product product6 = new Product("Наушники");


        ProductBasket basket = new ProductBasket();
        Article article1 = new Article("Ноутбук", "Это хороший ноутбук");
        Article article2 = new Article("Телефон", "Лучший телефон в этом году ");


        basket.addProduct(product1);
        //basket.addProduct(product2);
        basket.addProduct(product3);
        searchEngine.add((Searchable) product5);
        searchEngine.add((Searchable) product6);
        searchEngine.add((Searchable) product4);
        searchEngine.add((Searchable) article1);
        searchEngine.add((Searchable) article2);

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

