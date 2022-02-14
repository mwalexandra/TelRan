import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Auto auto0 = new Auto("Volvo", "c60", 10000);
        Auto auto1 = new Auto("Volvo", "c60", 10);
        Auto auto2 = new Auto("Mercedes", "amers", 40000);
        Auto auto3 = new Auto("Volvo", "a60", 5000);
        Auto auto4 = new Auto("Mercedes", "bmers", 30000);
        Auto auto5 = new Auto("Mercedes", "bmers", 10000000);

        List<Auto> autos = new ArrayList<>();
        autos.add(auto0);
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        autos.add(auto4);
        autos.add(auto5);

        App app = new App();
        System.out.println(app.autoByMake(autos));
    }

    public TreeMap<String, TreeSet<Auto>> autoByMake(List<Auto> autos) {
        TreeMap<String, TreeSet<Auto>> autoByMake = new TreeMap<>();

        for (Auto auto : autos) {
            if (autoByMake.containsKey(auto.make)) {
                TreeSet<Auto> value = autoByMake.get(auto.make);
                value.add(auto);
                autoByMake.put(auto.make, value);
            } else {
                TreeSet<Auto> value = new TreeSet<>(new ComparatorModel());
                value.add(auto);
                autoByMake.put(auto.make, value);
            }
        }
        return autoByMake;
    }
}
