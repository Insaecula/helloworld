package org.skypro.skyshop.basket;

public interface Searchable  {
    String getSearchTerm();
    String getContentType();
    String getName();

    default String getStringRepresenation() {
        return getName() + " - тип " + getContentType();
    }
}
