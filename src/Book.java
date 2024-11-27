public class Book {
    private String title;
    private int publicationYear;
    private Author author;

    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return getPublicationYear();
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


    @Override
    public String toString() {
        return "Book{" + "title='" + title + "'" + ", author='" + author + "'" + '}';
    }
    public int hashCode() {
        int result = title.hashCode();
        result = result + author.hashCode();
        return result;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        return author != null ? author.equals(book.author) : book.author == null;
    }
}

