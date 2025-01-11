package org.skypro.skyshop.product;

import org.skypro.skyshop.basket.Interface.Searchable;

public class Product implements Searchable {
    private final String name;


    public Product(String name) {
        this.name = name;
    }


    @Override
    public String getSearchTerm() {
        return "";
    }

    @Override
    public String getContentType() {
        return "";
    }

    public String getName() {
        return name;
    }

    @Override
    public String getStringRepresentation() {
        return "";
    }

    public int getPrice() {
        return 0;
    }


    public boolean isSpecial() {
        return false;
    }


    @Override
    public String toString() {
        return name + ": " + getPrice();
    }
}