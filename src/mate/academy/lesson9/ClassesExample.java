package mate.academy.lesson9;

public class ClassesExample {

    //has access from ClassExample?

    class NonStatic {

    }

    static class Static {
        private int value;
    }
}

class Main {
    public static void main(String[] args) {
        ClassesExample.Static stExample = new ClassesExample.Static();
        ClassesExample.NonStatic nonStaticExample = new ClassesExample(). new NonStatic();
    }
}
