package mate.academy.lesson14;

import mate.academy.lesson15.Printable;

public class Main {
    public static void main(String[] args) {
        Printable<String> stringPrintable = new PrintableImpl<>();
        stringPrintable.printAdditionalInfo("Hello");
        stringPrintable.print("Hello");
    }
}
