package Archive.Generics.ArrayList;

//https://www.youtube.com/watch?v=ZYzmt4LLvD0

import javax.swing.*;
import java.util.Arrays;

public class ArrayList<T> {
    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    private static final int DEFAULT_SIZE = 10;
    private T[] elements;
    private int size = 0;

    public ArrayList() {
        this.elements = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    public void add(T element) {
        if (this.size == elements.length) {
//            T[] oldElements = this.elements; // можно и не создавать массив для хранения старого а сразу скопировать
            this.elements = Arrays.copyOf(elements, elements.length + elements.length / 2);
        }
        this.elements[size] = element;
        size++;
    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        } else throw new ArrayIndexOutOfBoundsException();
    }

    void remove(int index) {
        if (index >= 0 && index < size) {
            System.arraycopy(elements, index + 1, elements, index, elements.length - 1 - index);
            this.size--;
        } else throw new ArrayIndexOutOfBoundsException();

//        if (index >= 0 && index < elements.length) {
//            T[] newArray = (T[]) new Object[size - 1];
//            for (int i = 0; i < index; i++) {
//                newArray[i] = elements[i];
//            }
//            for (int i = index; i < newArray.length; i++) {
//                newArray[i] = elements[i+1];
//            }
//        }
    }

}
