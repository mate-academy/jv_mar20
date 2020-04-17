package mate.academy.lesson15.optional;

import java.util.Optional;

import mate.academy.lesson10.Car;

public class Main {
    public static void main(String[] args) {
        Optional<Car> fromDb = getFromDb(50);

        fromDb.ifPresent(car -> System.out.println(car.toString()));

        Car carFromDb = getFromDb(40).orElseThrow(() -> new RuntimeException("Car cannot be found"));
    }

    public static Optional<Car> getFromDb(int licensePlate) {
        // some business logic
        if (licensePlate < 100) {
            return Optional.empty();
        }

        Car carFromDb = new Car(2019, "A4");
        return Optional.of(carFromDb);
    }
}
