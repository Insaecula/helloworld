package org.skypro.skyshop.Article;

public class Article {
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
    public String getContentType() {
        return "ARTICLE";
    }
    @Override
    public String getStringRepresentation() {
        return title + " — тип ARTICLE";
    }
}
