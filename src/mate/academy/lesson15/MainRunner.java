package mate.academy.lesson15;

import mate.academy.lesson10.Car;
import mate.academy.lesson11.Book;

public class MainRunner {
    public static void main(String[] args) {
        Printable<Car> carPrintable = car -> System.out.println(car.toString());

        Printable<Book> bookPrintable = book -> System.out.println("I am book, to string = " + book.toString());

        Car car = new Car(2019, "A4");
        carPrintable.print(car);
        carPrintable.printAdditionalInfo(car);

        Book book = new Book();
        book.setTitle("Kobzar");
        book.setAuthor("Shevchenko");
        bookPrintable.print(book);
        bookPrintable.printAdditionalInfo(book);

        Printable<String> stringPrintable = str -> System.out.println(str.toLowerCase());
    }

}
