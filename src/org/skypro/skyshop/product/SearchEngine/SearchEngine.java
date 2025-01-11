package org.skypro.skyshop.product.SearchEngine;


import org.skypro.skyshop.basket.Interface.Searchable;

public class SearchEngine {
    private Searchable[] items;
    private int count = 0;

    public SearchEngine(int capacity) {
        items = new Searchable[capacity];
    }

    public void add(Searchable item) {
        if (count < items.length) {
            items[count++] = item;
        }
    }

    public Searchable[] search(String searchTerm) {
        Searchable[] results = new Searchable[5];
        int resultCount = 0;

        for (Searchable item : items) {
            if (item != null && item.getSearchTerm().toLowerCase().contains(searchTerm.toLowerCase())) {
                results[resultCount++] = item;
                if (resultCount == 5) {
                    break;
                }
            }
        }

        return results;
    }
}
