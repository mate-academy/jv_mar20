package mate.academy.lesson14;

import mate.academy.lesson15.Printable;

public class PrintableImpl<T> implements Printable<String> {
    @Override
    public void print(String str) {
        System.out.println("I am implementation for String: " + str.toUpperCase());
    }

    @Override
    public String getInfo(String object) {
        return object.toUpperCase();
    }
}
