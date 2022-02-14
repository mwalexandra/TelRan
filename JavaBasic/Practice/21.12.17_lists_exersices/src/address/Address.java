package address;

public class Address {
//Address  с полями улица и номер дома
    private String street;
    private int house;

    public Address(String street, int house) {
        this.street = street;
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    @Override
    public String toString() {
        return "Address [house=" + house + ", street=" + street + "]";
    }
    
}
