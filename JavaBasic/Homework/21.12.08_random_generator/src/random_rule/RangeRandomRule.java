package random_rule;

import java.util.Random;

public class RangeRandomRule implements IRandomRule {

    private final int max;
    private final int min;
    private final Random rnd = new Random();

    public RangeRandomRule(int min, int max) {
        this.max = max;
        this.min = min;
    }

    @Override
    public int nextInt() {
        return rnd.nextInt(max - min) + min;
    }
    
}
