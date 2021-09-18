package week5.Task1;

import java.util.Comparator;
import java.util.NoSuchElementException;

public class CustomArrayList<T> {

    private static final int MIN_CAPACITY = 10;
    private static final int MAX_CAPACITY = 1000;
    private Object[] arr;
    private int size;

    public CustomArrayList() {
        this.arr = new Object[MIN_CAPACITY];
    }

    public void addAtTheBeginning(T t) {
        increaseArrayIfNeeded();
        copyArrayAdd(0, t);
        size++;
    }

    public void addAtGivenIndex(int index, T t) {
        increaseArrayIfNeeded();
        copyArrayAdd(index, t);
        if (arr[index] != null) size++;
    }

    public void addAtTheEnd(T t) {
        increaseArrayIfNeeded();
        arr[size++] = t;
        size++;
    }

    private Object[] increase() {
        Object[] obj = new Object[size * 2];
        for (int i = 0; i < size; i++) {
            obj[i] = arr[i];
        }
        return obj;
    }

    private boolean isIncreaseNeeded() {
        return size == arr.length;
    }

    private void increaseArrayIfNeeded() {
        if (isIncreaseNeeded()) {
            arr = increase();
        }
        if (isIncreaseNeeded() && size == MAX_CAPACITY) {
            throw new IndexOutOfBoundsException("There is not enough space");
        }
    }

    private void copyArrayAdd(int index, T t) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = t;
    }

    public int getIndex(T t) {
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (t.equals(arr[i])) {
                index = i;
                break;
            }
        }
        if (index != Integer.MIN_VALUE) {
            return index;
        } else throw new NoSuchElementException("Such element does not exist");
    }

    private void copyArrayDelete(int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = null;
    }

    public void removeElement(T t) {
        copyArrayDelete(getIndex(t));
    }

    public void removeGivenIndex(int index) {
        copyArrayDelete(index);
    }

    public void bubbleSort(Comparator<? super T> comparator, T[] array) {

        for (int i = 0; i < arr.length; i++) {
            T temp;
            for (int j = i + 1; j < arr.length - i; j++) {
                if (comparator.compare(array[i], array[j]) > 0) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;


                }
            }
        }

    }
}
