package list;

public class CustomLinkedList<T> implements CustomList<T> {

    Node<T> first;
    Node<T> last;
    private int size;

    public CustomLinkedList(Node<T> first, Node<T> last) {
        this.first = first;
        this.last = last;
    }

    private static class Node<E> {   // вложенный статический класс м.б. нужен для описания класса, в который он вложен. Имеет то же поведение, что и обычный класс
        E value;
        Node<E> next;
        Node<E> prev;

        public Node(E value, Node<E> prev, Node<E> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node<T> getNodeByIndex(int index){
        if(index < 0 || index > size)
            throw new CustomOutOfBoundsException();

        Node<T> currentNode = first;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    @Override
    public void set(int index, T value) {
        Node<T> node = getNodeByIndex(index);
        node.value = value;        
    }

    @Override
    public T get(int index) {
        Node<T> node = getNodeByIndex(index);
        return node.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T value) {
        Node<T> currentNode = first;

        for (int i = 0; i < size; i++) {
            if(currentNode.equals(value)) 
                return true;
        currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public T removeById(int index) {
        Node<T> node = getNodeByIndex(index);
        node.prev.next = node.next;
        node.next.prev = node.prev;
        
        size--;
        return node.value;
    }

    @Override
    public boolean removeByValue(T value) {
        Node<T> currentNode = first;

        for (int i = 0; i < size; i++) {
            if(currentNode.equals(value)) {
                removeById(i);
                return true;
            }    
        currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public void add(T value) {
        Node<T> node = new Node<>(value, last, null);

        if(size == 0){
            first = last = node;
        }else{
            last.next = node;
            last = node;
        }
        size++;
    }

    @Override
    public void insert(int index, T value) {
  
        Node<T> prevNode = getNodeByIndex(index - 1);
        Node<T> nextNode = prevNode.next;

        Node<T> newNode = new Node<>(value, prevNode, nextNode);
        prevNode.next = nextNode.prev = newNode;

        size++;
    }

    @Override
    public void println() {
        Node<T> currentNode = first;

        for (int i = 0; i < size; i++) {
            System.out.print(currentNode.value);
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    
}
