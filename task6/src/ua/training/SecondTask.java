package ua.training;

import java.util.Arrays;

class OnlyExpandableList<E> {

    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object data[];

    public OnlyExpandableList() {
        data = new Object[INITIAL_CAPACITY];
    }

    public void add(E e) {
        if (size == data.length) {
            ensureCapacity(); // capacity*2
        }
        data[size++] = e;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        return (E) data[index];
    }




    /**
     * Disallowed removing.
     */
    public void remove(int index) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("You can't remove elements from OnlyExpandableList");
    }

    /**
     * Method increases capacity of list by making it double.
     */
    private void ensureCapacity() {
        int newIncreasedCapacity = data.length * 2;
        data = Arrays.copyOf(data, newIncreasedCapacity);
    }


    public void display() {
        System.out.print("Displaying list : ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
    }
}

public class SecondTask {
    public static void main(String... a) {
        OnlyExpandableList<Integer> list = new OnlyExpandableList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        list.display();
        System.out.println();

        try {
            list.remove(1);
        }catch (Exception e){
            System.out.println("Oops! You tried do remove element...");
            e.printStackTrace();
        }

        list.display();

    }
}

//Source for ArrayList
//http://developer.classpath.org/doc/java/util/ArrayList-source.html
