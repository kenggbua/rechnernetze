package aufgabe2;

import java.util.Arrays;

public class IntegerList {

    private int[] data;
    private int size;
    private static final int DEFAULT_SIZE = 100;
    public IntegerList( ) {
        data = new int[DEFAULT_SIZE];
    }
    public IntegerList(IntegerList toCopy) {
        synchronized (toCopy){
            size = toCopy.size;
            data = Arrays.copyOf(toCopy.data, size);
        }
    }

    /**
     * TODO:
     * Implement:
     * get(int index) – Return the integer stored at index
     * add(int value) – Add a new value to the integer list
     * clear() – Deletes all integers
     * setCapacity(int n) – Reallocates the data array increasing or
     decreasing its size to n
     * toArray() – Returns a copy of the integer list and returns it
     *
     */

    public synchronized int get(int index) throws IllegalAccessException {
        if(index < 0 || index >= data.length){
            throw new IllegalAccessException("wrong input");
        }
        return data[index];
    }

    public synchronized void add(int value){
        if(size >= data.length){
            throw new IllegalStateException("full");
        }
        data[size] = value;
        size++;
    }

    public synchronized  void clear(){
        for (int i = 0; i < size; i++) {
            data[i] = 0;
        }
    }

    public synchronized void setCapacity(int n){
        int[] temp = new int[n];
        for (int i = 0; i < size; i++) {
            if(i >= n){
                break;
            }
            temp[i] = data[i];
        }
        data = temp;
    }

    public synchronized int[] toArray(){
        return Arrays.copyOf(data, data.length);
    }

}
