package list;

public class CustomArrayList<T> implements CustomList<T> {

    private static final int INITIAL_CAPACITY = 4;

    private T[] source;
    private int size;

    public CustomArrayList(){
        source = (T[]) new Object[INITIAL_CAPACITY];
    }

    @Override
    public void set(int index, T value) {
        if(index < 0 || index >= size)
            throw new CustomOutOfBoundsException();

        source[index] = value;    
    }

    @Override
    public T get(int index) {
        if(index < 0 || index >= size)
            throw new CustomOutOfBoundsException();
            
        return source[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(source[i]))
                return true;
        }
        return false;
    }

    @Override
    public T removeById(int index) {
        if(index < 0 || index >= size)
            throw new CustomOutOfBoundsException();
        
        T res = source[index];    
        for (int i = index + 1; i < size; i++) {
            source[i - 1] = source[i];
        }
        size--;
        return res;
    }

    @Override
    public boolean removeByValue(T value) {
        if(contains(value)){
            int indexOfValue = 0;
            for (int i = 0; i < source.length; i++) {
                if (source[i].equals(value))
                    indexOfValue = i;
            }
            for (int i = indexOfValue + 1; i < size; i++) {
                source[i - 1] = source[i];
            }
            size--;
            return true;
        }
        return false;
    }
    

    @Override
    public void add (T value) {
        if(size == source.length)
            increaseCapacity();  
            
        source[size++] = value;
    }

    @Override
    public void insert(int index, T value) {
        if(index < 0 || index > size)
            throw new CustomOutOfBoundsException();

        if(size == source.length)
            increaseCapacity(); 

        for (int i = size; i < index; i--) {
            source[i] = source[i - 1];
        }
        source[index] = value;
        size++;  
    }

    @Override
    public void println() {
        for (int i = 0; i < size; i++) {
            System.out.print(source[i] + " ");
        }
        System.out.println();        
    }

    private void increaseCapacity() {
        T[] newSource = (T[]) new Object[source.length * 2];

        for (int i = 0; i < source.length; i++) {
            newSource[i] = source[i];
        }
        source = newSource;
    }
}
