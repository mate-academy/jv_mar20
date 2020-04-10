package mate.academy.lesson10;

import java.util.HashMap;
import java.util.Map;

public class KeyHashCodeExample {

    public static void main(String[] args) {
        Map<Car, String> carStringMap = new HashMap<>();
        Car car = new Car(2019, "A4");
        carStringMap.put(car, "my value");

        System.out.println(carStringMap.get(car));

        Car car1 = new Car(2019, "A4");
        System.out.println(carStringMap.get(car1));
        System.out.println(car.hashCode());
        System.out.println(car1.hashCode());

        String abc = "abc";

        // somewhere else

        String newAbc = new String("abc");
        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put(abc, "data");

        String s = stringHashMap.get(newAbc);
        System.out.println(s);
    }
}
