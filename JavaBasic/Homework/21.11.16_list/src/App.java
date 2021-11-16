import list.AdvancedArrayList;
import list.CustomList;

public class App {

    // Интерфейс в java - это набор правил (методов), реализовать которые должны классы, имплементирующие этот интерфейс.
    // Или то контракт, которому должны следовать все классы, его имплементирующие.

    //Структура данных - это контейнер с множетсвом однотивных объектов, имеющий определенный набор правил (методов) для работы с ними
    // Структура данных List (список) - упорядоченная структыра данных, обладает следующими операциями:
        // - set
        // - get
        // - size
        // - add (append)
        // - insert
        // - remove (delete)
        // - contains

    public static void main(String[] args) {
        CustomList myList = new AdvancedArrayList();

        myList.add(10);
        myList.add(5);
        myList.add(3);

        myList.println();
        System.out.println(myList.contains(9));
    }
}
