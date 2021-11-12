public class AdvancedIntArray {

    private int[]source;

    public AdvancedIntArray(int initialSize){
        source = new int[initialSize];
    };

    public int get(int index) {
        return source[index];
    }

    public void set(int index, int value){
        source[index] = value;
    }

    public int size(){
        return source.length;
    }

    public void append(int value){
        int[] newSource = new int[source.length + 1];

        for (int i = 0; i < source.length; i++) {
            newSource[i] = source[i];
        }
        newSource[newSource.length - 1] = value;
        source = newSource;
    }

    public void insert(int index, int value){
        int[] newSource = new int[source.length + 1];

        for (int i = 0; i < index; i++) {
            newSource[i] = source[i];
        }
        newSource[index] = value;
        
        for (int i = index + 1; i < newSource.length; i++) {
            newSource[i] = source[i - 1];
        }
        source = newSource;
    } 

    public void delete(int index){
        int[] newSource = new int[source.length - 1];

        for (int i = 0; i < index; i++) {
            newSource[i] = source[i];
        }
        for (int i = index; i < newSource.length; i++) {
            newSource[i] = source[i + 1];
        }
        source = newSource;
    }

    public boolean contains(int value){
        for (int i = 0; i < source.length; i++) {
            if (source[i] == value)
                return true;
        }
        return false;
    }   
}    
