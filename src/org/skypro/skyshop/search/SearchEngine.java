package org.skypro.skyshop.search;

import org.skypro.skyshop.Exception.BestResultNotFound;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SearchEngine {
    private Searchable[] searchableItems;
    private int currentIndex = 0;


    public SearchEngine(int size) {
        searchableItems = new Searchable[size];
    }

    public SearchEngine() {

    }


    public void add(Searchable item) {
        if (currentIndex < searchableItems.length) {
            searchableItems[currentIndex++] = item;
        } else {
            System.out.println("Массив поиска переполнен");
        }
    }


    public Map<String, Searchable> search(String query) {
        List<Searchable> searchResults = getSearchResults(query);
        Map<String, Searchable> sortedResults = new TreeMap<>();
        for (Searchable result : searchResults) {
            sortedResults.put(result.getName(), result);
        }
        return sortedResults;
    }


    private List<Searchable> getSearchResults(String query) {
        List<Searchable> results = new ArrayList<>();
        for (Searchable item : searchableItems) {
            if (item != null && item.getSearchTerm().contains(query)) {
                results.add(item);
            }
        }
        return results;
    }


    public List<Searchable> findBestMatches(String search, List<Searchable> items) throws BestResultNotFound {
        if (search == null || search.trim().isEmpty()) {
            throw new IllegalArgumentException("Поисковый запрос не может быть пустым.");
        }

        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("Список объектов для поиска не может быть пустым или null.");
        }

        List<Searchable> bestMatches = new ArrayList<>();
        int maxMatches = 0;

        for (Searchable item : items) {
            if (item == null || item.getSearchTerm() == null) {
                continue;
            }

            int occurrences = countOccurrences(item.getSearchTerm(), search);
            if (occurrences > maxMatches) {
                maxMatches = occurrences;
                bestMatches.clear();
                bestMatches.add(item);
            } else if (occurrences == maxMatches && occurrences > 0) {
                bestMatches.add(item);
            }
        }

        if (bestMatches.isEmpty()) {
            throw new BestResultNotFound("Объект для поиска \"" + search + "\" не найден.");
        }

        return bestMatches;
    }


    private int countOccurrences(String text, String search) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(search, index)) != -1) {
            count++;
            index += search.length();
        }

        return count;
    }
}