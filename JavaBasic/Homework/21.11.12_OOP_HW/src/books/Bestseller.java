package books;

public class Bestseller extends LiteratureBook {
    double coef;

    public Bestseller(int id, String title, String author, int price, double coef) {
        super(id, title, author, price);
        this.coef = coef;
    }

    @Override
    public int computePrice() {
        return (int) (super.computePrice() * coef);
    }   
}