import java.util.Comparator;

public class AgeNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int res = Integer.compare(o1.getAge(), o2.getAge());

        if (res == 0)
            res = o1.getName().compareTo(o2.getName());

        return res;
    }

}
