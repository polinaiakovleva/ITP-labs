import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void bookPrice(String name, double price) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                book.setPrice(price);
                System.out.println("Price has been updated");
                return;

            }
        }
        System.out.println("Book is not found");
    }
    
    public void bookQuantity(String name, int qty) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                book.setQty(qty);
                System.out.println("Quantity has been updated");
            }
        }
        System.out.println("Book is not found");
    }

    public void libraryInfo() {
        if (books.isEmpty()) {
            System.out.println("Library does not contain books");
        }

        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void bookInfo(String name) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                System.out.println(book.toString());
            }
        }
        System.out.println("Book is not found");
    }

    public int librarySize() {
        return books.size();
    }
}

