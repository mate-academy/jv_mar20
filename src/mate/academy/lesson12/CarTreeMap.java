package mate.academy.lesson12;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import mate.academy.lesson10.Car;

public class CarTreeMap {
    public static void main(String[] args) {
        Car car1 = new Car(2019, "A4");
        Car car2 = new Car(2019, "A5");
        Map<Car, String> carStringMap = new TreeMap<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.hashCode(), o2.hashCode());
            }
        });
        carStringMap.put(car1, "hello");
        carStringMap.put(car2, "world");

        System.out.println(carStringMap);
    }
}
