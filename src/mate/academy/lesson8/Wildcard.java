package mate.academy.lesson8;

public class Wildcard <T> {
    T value;

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Wildcard<Object> wildcard = new Wildcard<>();
        wildcard.setValue(new Object());
    }
}

