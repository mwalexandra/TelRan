import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(10, "Boris", 75, 10000),
                new Employee(20, "Dmitry", 29, 20000),
                new Employee(5, "Anna", 45, 5000),
                new Employee(1, "Semen", 32, 50000),
                new Employee(3, "C1", 32, 50000));

        Collections.sort(employees);
        System.out.println("by id");
        System.out.println(employees);

        Collections.sort(employees, new SalaryComparator());
        System.out.println("by salary");
        System.out.println(employees);

        Collections.sort(employees, new AgeComparator());
        System.out.println("by Age");
        System.out.println(employees);

        Collections.sort(employees, new NameComparator());
        System.out.println("by name");
        System.out.println(employees);

        Collections.sort(employees, new AgeNameComparator());
        System.out.println("by age and name");
        System.out.println(employees);
    }
}
