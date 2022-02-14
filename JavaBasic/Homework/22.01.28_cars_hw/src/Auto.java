import java.util.Comparator;

public class Auto implements Comparable<Auto> {

    public String make;
    public String model;
    public int price;

    public Auto(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto [make=" + make + ", model=" + model + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Auto o) {
        return this.make.compareTo(o.make);
    }
}
