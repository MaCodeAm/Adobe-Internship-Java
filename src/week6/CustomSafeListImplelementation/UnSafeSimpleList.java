package week6.CustomSafeListImplelementation;

public class UnSafeSimpleList<T> implements SimpleList<T>{
    Object array = new Object[10000];

    @Override
    public void add(T item) {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public T get(int index) {
        return null;
    }
}
