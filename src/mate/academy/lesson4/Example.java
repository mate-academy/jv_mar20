package mate.academy.lesson4;

import java.io.FileNotFoundException;

public class Example {
    public static void main(String[] args) {
        Airplane1 airplane1 = new Airplane1();
        try {
            airplane1.fly();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//You have a class Plane.
class Plane {
    public void fly() throws Exception {

    }
}
//Which one option will be correct?
//1
class Airplane extends Plane {
    @Override
    public void fly() throws Exception{
    }
}

//2
class Airplane1 extends Plane {
    @Override
    public void fly()  {

    }
}
