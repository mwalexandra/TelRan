import java.util.ArrayList;
import java.util.List;

import random_rule.IRandomRule;
import random_rule.ListRandomRule;
import random_rule.MaxRandomRule;
import random_rule.RangeRandomRule;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(15);

        IRandomRule maxRandomRule = new MaxRandomRule(10);
        RandomGenerator maxGenerator = new RandomGenerator(maxRandomRule);

        IRandomRule rangeRandomRule = new RangeRandomRule(2, 10);
        RandomGenerator rangeGenerator = new RandomGenerator(rangeRandomRule);

        IRandomRule listRandomRule = new ListRandomRule(numbers);
        RandomGenerator listGenerator = new RandomGenerator(listRandomRule);

        println(maxGenerator.generate(20));
        println(rangeGenerator.generate(5));
        println(listGenerator.generate(3));
    }

    public static void println(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();        
    }
}
