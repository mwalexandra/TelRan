import objects.Car;

public class App {
    public static void main(String[] args) {

        Car volvo = new Car();
        volvo.colour = "Red";
        volvo.licencePlate = 1234;
        volvo.make = "Volvo S80";
        volvo.year = 2000;

        System.out.println("Our car colour is " + volvo.colour);

    }
}
