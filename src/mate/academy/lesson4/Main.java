package mate.academy.lesson4;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws MyException {
        try {
            System.out.println(getStringLength("hello"));
            System.out.println(getStringLength("hi"));
        } catch (SQLException e) {
            System.out.println("I am swallowing SQL Exception" + e);
            System.out.println("My super business handler");
        } catch (Exception e) {
            throw new MyException("My custom message", e);
        }
    }

    public static int getStringLength(String s) throws Exception {
        throw new Exception("Some complex exception");

    }
}
