public class lastNumOfFibTest {

    App app = new App();

    @Test
    void lastNumOfFibModulo_one() {
        assertEquals(1, app.lastNumOfFibModulo(1));}
        
    @Test
    void lastNumOfFibModulo_3() {
        assertEquals(2, app.lastNumOfFibModulo(3));}
}
