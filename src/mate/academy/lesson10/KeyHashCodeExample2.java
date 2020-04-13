package mate.academy.lesson10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class KeyHashCodeExample2 {
    public static void main(String[] args) {
        Map<Car, String> carStringMap = new HashMap<>();
        Car car = new Car(2019, "A4");
        carStringMap.put(car, "my value");
        System.out.println(carStringMap.get(car));
        System.out.println("car hashCode = " + car.hashCode());


        car.setModel("A5");
        System.out.println(carStringMap.get(car));
        System.out.println("car hashCode after modification = " + car.hashCode());

        Car car1 = new Car(2019, "A4");
        System.out.println(carStringMap.get(car1));

//        System.out.println("car 1 hashCode = " + car1.hashCode());
//        for (Car c : carStringMap.keySet()) {
//            System.out.print("HashCode = " + c.hashCode());
//            System.out.println(", equals to car1 = " + c.equals(car1));
//        }

        Iterator<Map.Entry<Car, String>> hashMapIterator = carStringMap.entrySet().iterator();
        while (hashMapIterator.hasNext()) {
            Map.Entry<Car, String> entry = hashMapIterator.next();
            System.out.print("key = " + entry.getKey() + " and hashCode = " + entry.getKey().hashCode());
            System.out.println(", value = " + entry.getValue());
        }
    }
}
