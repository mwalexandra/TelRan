public class App {
    public static void main(String[] args) {

        int[] array = {10, 8, 23};

        // Объект "массив" обладает следующими методами:
        // int get(int index) --> геттер, возвращает элемент по интексу (порядковому номеру)
        // void set (int index, int value) --> сеттер, устанавливает значение value на место index
        // int size() --> возвращает размер массива 
        
        // Мы можем написать новый класс, чтобы описать другие методы для массива
        // void append() -> добавить элемент
        // void insert() -> вставить элемент в середину
        // void delete() -> удалить элемент
        // boolean contains(int value) -> узнать, содержит ли массив число

        AdvancedIntArray advancedArray1 = new AdvancedIntArray(3); 
        advancedArray1.set(0, 10);
        advancedArray1.set(1, 8);
        advancedArray1.set(2, 23);

        int el2 = advancedArray1.get(1); // 8
        advancedArray1.set(2, 239); // {10, 8, 239}
        int length = advancedArray1.size(); // 2

        advancedArray1.append(500); // {10, 8, 239, 500}
        advancedArray1.delete(1);  // {10, 239, 500}
        advancedArray1.insert(2, 20); // {10, 239, 20, 500}
        System.out.print(advancedArray1.get(0) + " ");
        System.out.print(advancedArray1.get(1) + " ");
        System.out.print(advancedArray1.get(2) + " ");
        System.out.print(advancedArray1.get(3) + " ");
        System.out.println();
    }
}
