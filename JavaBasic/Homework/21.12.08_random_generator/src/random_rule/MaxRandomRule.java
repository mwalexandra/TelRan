package random_rule;
import java.util.Random;

public class MaxRandomRule implements IRandomRule {

    private final int max;

    public MaxRandomRule(int max) {
        this.max = max;
    }

    @Override
    public int nextInt() {
        Random rnd = new Random();
        return rnd.nextInt(max); // generates random numbers from o incl. to max excl.
    }
    
}
