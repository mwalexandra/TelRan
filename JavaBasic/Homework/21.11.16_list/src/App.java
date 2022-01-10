import list.CustomArrayList;
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
        CustomList<Integer> myList = new CustomArrayList<>();

        myList.add(10);
        myList.add(5);
        myList.add(3);

        myList.println(); // 10, 5, 3
        myList.set(0, 9); // 9, 5, 3
        System.out.println(myList.get(1)); // 5
        System.out.println(myList.size()); // 3
        System.out.println(myList.contains(9)); // true
        myList.removeById(2); // 9, 5
        myList.add(3); // 9, 5, 3
        myList.insert(2, 10); // 9, 5, 10, 3
        myList.println();

        //  Iterator<Integer> iterator = myList.iterator();
        // while(iterator.hasNext()){
        //     int num = iterator.next();
        //     System.out.println(num);
        // }

        for(int number : myList){   // только для iteratable объектов
            System.out.println(number);
        }
    }
}
