package mate.academy.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setTitle("kobzar");
        myBook.setAuthor("Shevchenko");

        List<String> values = new ArrayList<>();
        values.add("Hello");
        values.add("Mates!");

        Immutable.Builder immutableBuilder = new Immutable.Builder();
        Immutable immutable = immutableBuilder
                .setName("  Bob   ")
                .setSize(15)
                .setBook(myBook)
                .setValues(values)
                .build();

        System.out.println(immutable);

        immutable.getBook().setAuthor("Franko");
        System.out.println(immutable);

        immutable.getValues().add("new string");
        System.out.println(immutable);

        //Why is important to clone objects in the constructor?
        myBook.setTitle("Bukvar");
        System.out.println(immutable);

        // Does the Book change the author?
        Book book = immutable.getBook();
        System.out.println("Book before setter: " + book);
        book.setAuthor("Franko");
        System.out.println("Book after setter: " + book);
        Book newBook = immutable.getBook();
        System.out.println(newBook);


    }
}
