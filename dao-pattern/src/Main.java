import com.dao.example.Book;
import com.dao.example.BookDaoIml;

public class Main {
    public static void main(String[] args) {
        BookDaoIml bookDaoIml = new BookDaoIml();
        System.out.println("Before changes: ");
        bookDaoIml.printBooks();
        bookDaoIml.addBook(new Book(123, "Book3", "Author3", 456, 3));
        bookDaoIml.editBook(111, new Book(111, "Book1Edit", "Author1", 222, 7));
        bookDaoIml.deleteBook(bookDaoIml.getBooks().get(1));
        System.out.println("After changes: ");
        bookDaoIml.printBooks();
    }
}