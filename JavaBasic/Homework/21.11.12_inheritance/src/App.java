import employee.Employee;
import employee.HourBasedEmployee;
import employee.Manager;
import employee.OfficeEmployee;

public class App {
    public static void main(String[] args) {

        // Наследование классов - это способность одного класса наследовать (расширять/extend) функциональность другого класса  

        Employee empoyeeVasya = new OfficeEmployee(1, "Vasya", "Telran", 2000, 200);
        Employee officeEmployeePetya = new OfficeEmployee(2, "Petya", "Telran", 2500, 300);

        Employee managerStepan = new Manager(3, "Stepan", "Telran", 2000, 2.5);
        Employee hourTanya = new HourBasedEmployee(4, "Tatiana", "Telran", 2500, 150);

        System.out.println(empoyeeVasya.calcSalary());
        System.out.println(officeEmployeePetya.calcSalary());
        System.out.println(managerStepan.calcSalary());
        System.out.println(hourTanya.calcSalary());

    }
}
