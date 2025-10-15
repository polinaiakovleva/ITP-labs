public class ex2 {
    public static void main(String[] args) {
        Author author1 = new Author("Джордж Оруэлл", "orwell@email.com", 'M');
        Author author2 = new Author("Джоан Роулинг", "rowling@email.com", 'F');
        Author author3 = new Author("Лев Толстой", "tolstoy@email.com", 'M');

        Book book1 = new Book("1984", author1, 15.99, 10);
        Book book2 = new Book("Гарри Поттер и философский камень", author2, 20.50, 5);
        Book book3 = new Book("Анна Каренина", author3, 18.75);
        Book book4 = new Book("Скотный двор", author1, 12.25, 8);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.libraryInfo();
        
    }
}