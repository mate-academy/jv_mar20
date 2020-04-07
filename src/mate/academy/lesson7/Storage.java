package mate.academy.lesson7;

import mate.academy.lesson6.equals.Car;

public class Storage {
    private Object value;

    public void setValue(Object value) {
        this.value = value;
    }
}


class Main {
    public static void main(String[] args) {
        Storage carStorage = new Storage();
        carStorage.setValue(new Car(100,20));
        carStorage.setValue(Integer.valueOf(10));
    }
}
