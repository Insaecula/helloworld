package org.skypro.skyshop.Article;

import org.skypro.skyshop.basket.Interface.Searchable;

public  class Article  implements Searchable {
    private final String title;
    private final String text;



    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Article{" + "title='" + title + '\'' + ", text='" + text + '\'' + '}';
    }

    @Override
    public String getSearchTerm() {
        return "";
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getStringRepresentation() {
        return title + " — тип ARTICLE";
    }
}
