package org.skypro.skyshop.search;

import org.skypro.skyshop.Exception.BestResultNotFound;

import java.util.*;
import java.util.stream.Collectors;

public class SearchEngine {
    private List<Searchable> searchableItems;

    public SearchEngine() {
        this.searchableItems = new ArrayList<>();

    }

    public void add(Searchable item) {
        searchableItems.add(item);
    }

    public Set<Searchable> search(String searchTerm) {
        return searchableItems.stream()
                .filter(item -> item.getSearchTerm().contains(searchTerm))
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Searchable::getSearchTerm))));
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


    private static class SearchableComparator implements Comparator<Searchable> {
        @Override
        public int compare(Searchable o1, Searchable o2) {
            int lengthCompare = Integer.compare(o2.getName().length(), o1.getName().length());
            if (lengthCompare != 0) {
                return lengthCompare;
            }
            return o1.getName().compareTo(o2.getName());
        }
    }
}