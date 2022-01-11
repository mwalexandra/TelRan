import org.junit.Before;

public class CustomArrayDequeTest extends CustomDequeTest {

    @Before
    public void init() {
        dqList = new CustomArrayDeque<>();
    }
}
