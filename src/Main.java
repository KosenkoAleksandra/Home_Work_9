public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Антон", "Чехов");
        System.out.println(author1.getName() + " " + author1.getLastName());
        System.out.println(author2.getName() + " " + author2.getLastName());
        Book book1 = new Book("Медный всадник", author1, 2014);
        Book book2 = new Book("Каштанка", author2, 2017);
        System.out.println(book1.getTitle() + " " + book1.getAuthor() + " " + book1.getPublicationYear());
        System.out.println(book2.getTitle() + " " + book2.getAuthor() + " " + book2.getPublicationYear());
        book1.setPublicationYear(2022);
        System.out.println(book1.getTitle() + " " + book1.getAuthor() + " " + book1.getPublicationYear());
        System.out.println(author1.equals(author2));
        System.out.println(book1.equals(book2));
        System.out.println(book1);
        System.out.println(book2);



    }
}