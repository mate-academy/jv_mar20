package mate.academy.lesson8;

import java.util.List;

public class ArrayList<T extends Number> {
    private Object[] value = new Object[10];
    private int index = 0;

    public void add(T elem) {
        value[index] = elem;
        index++;
    }

    public T getByIndex(int index) {
        return (T) value[index];
    }

    // PECS
    public List<? extends Number> getAll() {
        List<Integer> integers = new java.util.ArrayList<>();
        return integers;
    }
}
