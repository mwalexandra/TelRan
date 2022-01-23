import org.junit.jupiter.api.BeforeEach;

public class HashMapTest extends MapTest {

    @BeforeEach
    public void init() {
        map = new HashMap<Integer, String>();
    }
}
