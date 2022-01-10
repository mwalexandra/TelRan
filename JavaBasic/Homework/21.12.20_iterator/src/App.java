import java.util.Iterator;

public class App {

     // итератор - это паттерн проектирования, предоставляющий возможность (правило) перебирать элементы какой-либо коллекции (структуры данных)
    
    public static void main(String[] args) {
        int[] array = {5, 1, 27};
        
        Iterator<Integer> iterator = new ForwardArrayIterator(array);

        while(iterator.hasNext()){
            int num = iterator.next();
            System.out.println(num);
        }

        Iterator<Integer> backwardIterator = new BackwardArrayIterator(array);

        while(backwardIterator.hasNext()){
            int num = backwardIterator.next();
            System.out.println(num);
        }

        Iterator<Integer> increasingIterator = new IncreasingArrayIterator(array);

        while(increasingIterator.hasNext()){
            int num = increasingIterator.next();
            System.out.println(num); // print elements by icreasing order expected
        }
    }
}
