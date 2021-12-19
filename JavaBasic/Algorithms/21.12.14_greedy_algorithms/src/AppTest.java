import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class AppTest {
    App app = new App();

    @Test
    public void testGetRefuelingNum() {
        int[] fuelStations = new int[] {300, 450, 600, 750, 900};
        assertEquals(3, app.getRefuelingNum(1000, 350, fuelStations));
    }

    @Test
    public void testGetRefuelingNum_LIs_800() {
        int[] fuelStations = new int[] {300, 450, 600, 750, 900};
        assertEquals(2, app.getRefuelingNum(800, 350, fuelStations));
    }

    @Test
    public void testGetRefuelingNum_lLessThanMaxDistanse() {
        int[] fuelStations = new int[] {300, 450, 600, 750, 900};
        assertEquals(0, app.getRefuelingNum(320, 350, fuelStations));
    }

    @Test
    public void testGetSegmentNum() {
        int[] num = new int[] {2, 2, 4, 6, 6, 8, 9};
        assertEquals(2, app.getSegmentNum(num, 3));
    }

    @Test
    public void testExchangeMoney() {
        assertEquals(15, app.exchangeMoney(118));
    }

    @Test
    public void testExchangeMoney_moneyIsNull() {
        assertEquals(0, app.exchangeMoney(0));
    }
}
