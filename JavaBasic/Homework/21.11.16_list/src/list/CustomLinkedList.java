package list;

import java.util.Iterator;

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
        if(index < 0 || index >= size)
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
        Node<T> node = findNodeByValue(value);
        return node != null;
    }


    /**
     * The method finds the most left node containing the value
     * @param value
     * @return node with the value or null
     */
    private Node<T> findNodeByValue(T value) {
        Node<T> currentNode = first;

        for (int i = 0; i < size; i++) {
            if(currentNode.value.equals(value)) 
                return currentNode;

        currentNode = currentNode.next;
        }
        return null;
    }

    @Override
    public T removeById(int index) {
        Node<T> node = getNodeByIndex(index);
        T res = node.value;
        removeNode(node);

        return res;
    }

    /**
     * remove node
     * @param node must be non-null
     */
    private void removeNode(Node<T> node) {
        Node<T> left = node.prev;
        Node<T> right = node.next;

        if(left == null){
            first = right;
        } else {
            left.next = right;
        }

        if(right == null){
            last = left;
        } else {
            right.prev = left;
        }

        node.next = null;
        node.prev = null;
        node.value = null;

        size--;

    }

    @Override
    public boolean removeByValue(T value) {
        Node<T> currentNode = findNodeByValue(value);
        if (currentNode == null)
            return false;
        
        removeNode(currentNode);
        return true;
    }

    @Override
    public void add(T value) {
        Node<T> node = new Node<>(value, last, null);

        if(size == 0){
            first = last = node;
        }else{
            last.next = node;
        }
        last = node;
        size++;
    }

    @Override
    public void insert(int index, T value) {
        Node<T> right;
        Node<T> left;

        if(index == size){
            left = last;
            right = null;
        } else {
            right = getNodeByIndex(index);
            left = right.prev;
        }

        Node<T> newNode = new Node<>(value, left, right);
        if(left == null){
           first = newNode;
        } else {
            left.next = newNode;
        }

        if(right == null){
            last = newNode;
        } else {
            right.next = newNode;
        }

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

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new BasicIterator<>(first);
        return iterator;
    }

    private static class BasicIterator<E> implements Iterator<E>{

        private Node<E> currentNode;
        
        public BasicIterator(Node<E> currentNode) {
            this.currentNode = currentNode;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null; 
        }

        @Override
        public E next() {
            E res = currentNode.value;
            currentNode = currentNode.next;
            return res;
        }

    }
    
}
