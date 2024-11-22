//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Leo ", "Tolstoy");
        Author author2 = new Author("Fyodor ", "Dostoevsky");

        Book book1 = new Book("Война и мир", 1869, author1);
        Book book2 = new Book("Преступление и наказание", 1842, author2);

        book1.setPublicationYear(1870);



    }
}