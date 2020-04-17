package mate.academy.lesson15;

@FunctionalInterface
public interface MyFunctional<T> {
    String getToString(T o);
}
