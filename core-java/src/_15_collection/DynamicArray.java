package _15_collection;

public class DynamicArray {

    private Object[] data;
    private int capacity = 10;
    private int size = 0;

    DynamicArray() {

        data = new Object[capacity];
    }

    DynamicArray(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            data = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }

    }

    public void add(Object object) {
        //array is full
        if (size == capacity) {
            capacity *= 2;
            Object[] newArray = new Object[capacity];
            for (int index = 0; index < data.length; index++) {
                newArray[index] = data[index];
            }
            newArray[size++] = object;
            data = newArray;

        }
        //array has space
            data[size++] = object;

    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public Object get(int index) {
        return data[index];
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[ ");
        for (int index = 0; index < size; index++) {
            str.append(data[index].toString()+", ");
        }
        str.append(" ]");
        return str.toString();
    }
}
