package org.skypro.skyshop.search;
import org.skypro.skyshop.Exception.BestResultNotFound;

import java.util.List;

    public class SearchEngine {

        public Searchable findBestMatch(String search, List<Searchable> items) throws BestResultNotFound {
            if (search == null || search.trim().isEmpty()) {
                throw new IllegalArgumentException("Поисковый запрос не может быть пустым.");
            }

            if (items == null || items.isEmpty()) {
                throw new IllegalArgumentException("Список объектов для поиска не может быть пустым или null.");
            }

            Searchable bestMatch = null;
            int maxMatches = 0;

            for (Searchable item : items) {
                if (item == null || item.getSearchTerm() == null) {
                    continue;
                }

                int occurrences = countOccurrences(item.getSearchTerm(), search);
                if (occurrences > maxMatches) {
                    maxMatches = occurrences;
                    bestMatch = item;
                }
            }

            if (bestMatch == null) {
                throw new BestResultNotFound("Объект для поиска \"" + search + "\" не найден.");
            }

            return bestMatch;
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
