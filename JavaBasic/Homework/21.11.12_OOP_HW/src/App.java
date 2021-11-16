import books.Bestseller;
import books.Book;
import books.LiteratureBook;
import books.TechnicalBook;

public class App {
    public static void main(String[] args) {

        Book book1 = new LiteratureBook(1, "War and peace", "Tolstoi", 500);
        Book book2 = new TechnicalBook(2, "A Brief History of Time", "Hawking", 600, "Physics");
        Book book3 = new LiteratureBook(3, "Faust", "Geothe", 550);
        Book book4 = new Bestseller(4, "Java", "Bloch", 1200, 1.1);

        Book[] books = {book1, book2, book3, book4};

        for (int i = 0; i < books.length; i++) {
            System.out.println(describeBook(books[i]));
        }
    }

    // Полиморфизм - возможность применять один и тот же метод у объектов различных типов (классов), связанных общим родителем
    // этот метод существует в родительском классе
    static String describeBook(Book book){
       return (book.getId() + " " + book.getAuthor() + " " + book.getTitle() + " " + book.computePrice());
    } 


    // Наследование
    // - расширять можно только один класс
    // - можно переобпределять метод родителя. К родительскому методу можно обратиться чреез super
    // - и в родителе и в дочернем классе можно иметь одноименные переменные, При жтом это разные переменные (у обеих есть свое значение)
    // - статические методы и переменные индивидуальны у родителя и наследников
    // - методы в Java переопределяются. Неважно, какого типа ссылка была использована для вызова метода. 
}
