package mate.academy.lesson4;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}

// checked exceptions --- IOException --
// unchecked exceptions - NPE, IndexOutOfBound, ArithmeticException
