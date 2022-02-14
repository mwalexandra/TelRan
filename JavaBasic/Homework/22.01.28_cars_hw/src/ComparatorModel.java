import java.util.Comparator;

public class ComparatorModel implements Comparator<Auto> {

    @Override
    public int compare(Auto o1, Auto o2) {
        int flag = (o1.model.compareTo(o2.model));
        if (flag == 0)
            flag = Integer.compare(o1.price, o2.price);
        return flag;
    }
}
