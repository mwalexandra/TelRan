import books.Bestseller;
import books.Book;
import books.LiteratureBook;
import books.TechnicalBook;

public class App {
    public static void main(String[] args) {

        Book book1 = new Book(1, "War and peace", "Tolstoi", 500);
        Book book2 = new TechnicalBook(2, "A Brief History of Time", "Hawking", 600, "Physics");
        Book book3 = new LiteratureBook(3, "Faust", "Geothe", 550);
        Book book4 = new Bestseller(4, "Java", "Bloch", 1200, 1.1);

        Book[] books = {book1, book2, book3, book4};

        System.out.println(describeBook(books[0]));
        System.out.println(describeBook(books[1]));
        System.out.println(describeBook(books[2]));
        System.out.println(describeBook(books[3]));
    }

    static String describeBook(Book book){
       return (book.getId() + " " + book.getAuthor() + " " + book.getTitle() + " " + book.computePrice());
    } 
}
