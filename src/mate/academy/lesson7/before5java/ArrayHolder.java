package mate.academy.lesson7.before5java;

public class ArrayHolder<T> {
    private Object [] array = new Object[10];

    public T getByIndex(int index) {
        return (T) array[index];
    }

    public void add(T data) {
        array[0] = data;
    }
}
