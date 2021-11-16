package books;

public class Bestseller extends LiteratureBook {
    double coef;

    public Bestseller(int id, String title, String author, int price, double coef) {
        super(id, title, author, price);
        this.coef = coef;
    }

    public double getCoef() {
        return coef;
    }

    @Override
    public int computePrice() {
        return (int) (super.computePrice() * coef);
    }   
}