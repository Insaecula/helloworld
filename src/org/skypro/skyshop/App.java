package org.skypro.skyshop;



import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
 org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {

        Product product1 = new SimpleProduct("Товар 1", 100);
        Product product2 = new DiscountedProduct("Товар 2", 200, 20);
        Product product3 = new FixPriceProduct("Товар 3");


        ProductBasket basket = new ProductBasket();


        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);


        basket.printBasket();


        System.out.println("Общая стоимость корзины: " + basket.getTotalCost());


        System.out.println("Есть ли товар 'Товар 1' в корзине? " + basket.containsProduct("Товар 1"));
        System.out.println("Есть ли товар 'Товар 4' в корзине? " + basket.containsProduct("Товар 4"));


        basket.clearBasket();


        basket.printBasket();
    }
}

