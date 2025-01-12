package org.skypro.skyshop.search;

public class SearchEngine {
    private final Searchable[] searchableItems;
    private int currentIndex = 0;

    public SearchEngine(int size) {
        searchableItems = new Searchable[size];
    }

    public void add(Searchable item) {
        if (currentIndex < searchableItems.length) {
            searchableItems[currentIndex++] = item;
        } else {
            System.out.println("Массив поиска переполнен");
        }
    }

    public Searchable[] search(String query) {
        Searchable[] results = new Searchable[5];
        int index = 0;

        for (Searchable item : searchableItems) {
            if (item != null && item.getSearchTerm().contains(query)) {
                results[index++] = item;
                if (index == 5) break;
            }
        }

        return results;
    }
}
