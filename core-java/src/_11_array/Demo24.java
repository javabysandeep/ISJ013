package _11_array;

import java.util.Arrays;

public class Demo24 {
    public static void main(String[] args) {
        class DynamicArrayList {
            private Object[] values;
            private int capacity = 10;
            private int size = 0;

            public DynamicArrayList() {
                values = new Object[capacity];
            }

            public void add(Object object) {
                if (size < capacity) {
                    values[size++] = object;
                }
                if (size == capacity) {
                    capacity *= 2;
                    Object[] newValues = new Object[capacity];
                    for (int i = 0; i < values.length; i++) {
                        newValues[i] = values[i];
                    }
                    values = newValues;
                    values[size++] = object;
                }
            }

            @Override
            public String toString() {
                return "DynamicArrayList{" +
                        "values=" + Arrays.toString(values) +
                        ", capacity=" + capacity +
                        ", size=" + size +
                        '}';
            }
        }

        DynamicArrayList list = new DynamicArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add("String");
        list.add(true);
        list.add(true);
        list.add(true);
        list.add(true);
        list.add(true);
        list.add(true);
        System.out.println(list);//print the content
    }
}
