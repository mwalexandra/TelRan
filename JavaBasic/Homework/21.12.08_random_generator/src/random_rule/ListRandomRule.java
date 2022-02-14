package random_rule;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListRandomRule implements IRandomRule {

    private List<Integer> numbers;
    Random rnd = new Random();

    public ListRandomRule(List<Integer> numbers){
        this.numbers = new ArrayList<>(numbers);
    }

    @Override
    public int nextInt() {
        return numbers.get(rnd.nextInt(numbers.size()));
    }
}