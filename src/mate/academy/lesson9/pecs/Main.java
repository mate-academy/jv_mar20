package mate.academy.lesson9.pecs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<Toyota> toyotaList = new ArrayList<>();
        toyotaList.add(new Toyota());
        toyotaList.add(new Camry());
        printValues(toyotaList);

        List<? super Toyota> newList = new ArrayList<Object>();
        newList.add(new Toyota());
        newList.add(new Camry());
        List<? super Car> values = getRandomValues();
        for (int i = 0; i < values.size(); i++) {
            Car car = (Car) values.get(i);
            car.printMySelf();
        }
    }

    // PECS - Producer Extends Consumer Super
    public static void printValues(List<? extends Car> values) { // Producer is Collection (values)
        for (int i = 0; i < values.size(); i++) {
            values.get(i).printMySelf();
        }
    }

    public static List<? super Car> getRandomValues() {
        List<? super Car> toyotaList = new ArrayList<>(); // Consumer is Collection (toyotaList)
        toyotaList.add(new Toyota());
        toyotaList.add(new Camry());
        return toyotaList;
    }
}
