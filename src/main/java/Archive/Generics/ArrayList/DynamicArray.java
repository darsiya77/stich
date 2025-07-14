package Archive.Generics.ArrayList;

import java.util.Arrays;

public class DynamicArray<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private T[] elements;

    public DynamicArray() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(T el) {
        if (this.size == elements.length) {
            this.elements = Arrays.copyOf(this.elements, elements.length + elements.length / 2);
        }
        this.elements[size] = el;
        size++;
    }

    public T get(int index) {
        if (index >= 0 && index < this.size) {
            return elements[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            System.arraycopy(this.elements, index + 1, this.elements, index, this.elements.length - 1 - index);
            this.size--;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
