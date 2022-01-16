import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NaiveMaxStackTest {

    MaxStack maxStack = new NaiveMaxStack();
    MaxStack maxStackIt = new NonnaiveMaxStack();

    @Test
    void testGetMax() {
        maxStack.add(12);
        maxStack.add(34);
        maxStack.add(0);

        assertEquals(34, maxStack.getMax());
    }

    @Test
    void testGetMaxIt() {
        maxStack.add(12);
        maxStack.add(34);
        maxStack.add(0);

        assertEquals(34, maxStack.getMax());
    }
}
