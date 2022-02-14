
import java.util.List;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.*;

import address.Address;
import address.Person;

public class AppTest {

    App app = new App();

    @Test
    public void testGetAddresses_empty() {
        assertEquals(Arrays.asList(), app.getAddresses(Arrays.asList()));
    }

    @Test
    public void testGetAddresses_several() {
        Address address1 = new Address("street1", 1);
        Address address2 = new Address("street2", 2);
        Person person1 = new Person("person1", address1);
        Person person2 = new Person("person2", address2);
        List<Address> expected = Arrays.asList(address1, address2);
        List<Person> actual = Arrays.asList(person1, person2);

        assertEquals(expected, app.getAddresses(actual));
    }

    @Test
    public void testListWithoutNamesLengthFour_oneElement_Length6(){
        List<String> list = new ArrayList<>();
        list.add("John");
        List<String> expected = Arrays.asList("John");

        assertEquals(expected, app.listWithoutNamesLengthFour(list));
    }
}
