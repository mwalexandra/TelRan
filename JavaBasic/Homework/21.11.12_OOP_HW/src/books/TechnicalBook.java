package books;

public class TechnicalBook extends Book {
    String scientificField;

    public TechnicalBook(int id, String title, String author, int price, String scientificField) {
        super(id, title, author, price);
        this.scientificField = scientificField;
    }

    public String getScientificField() {
        return scientificField;
    }
    
}
