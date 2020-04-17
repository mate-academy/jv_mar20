package mate.academy.lesson15;

@FunctionalInterface
public interface Printable<T> {
    public abstract void print(T o);

    default void printAdditionalInfo(T object) {
        System.out.println("Additional info from default method"
        + ", ToString: " + object.toString()
        + ", HashCode: " + object.hashCode()
        + ", Class: " + object.getClass());
    }

    default String getInfo(T object) {
        return "Some extra data";
    }
}
