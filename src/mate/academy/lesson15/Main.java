package mate.academy.lesson15;

import mate.academy.lesson10.Car;
import mate.academy.lesson11.Book;

public class Main {
    public static void main(String[] args) {
        MyFunctional<Car> carMyFunctionalAnonymous = new MyFunctional<Car>() {
            @Override
            public String getToString(Car car) {
                return car.toString();
            }
        };
        MyFunctional<Car> carMyFunctionalLambda = car -> car.toString();
        MyFunctional<Car> carMyFunctional = Car::toString;

        // No static reference available
        MyFunctional<Book> bookMyFunctional = book -> book.toString().toUpperCase();

        MyFunctional<String> stringFunctional = String::toUpperCase;
        Drawable drawable = (s1, s2) -> (s1 + s2).toUpperCase();
        System.out.println(drawable.getDrawInfo("Hello ", "mate"));

        Car car = new Car(2019, "A4");
        String toString = carMyFunctional.getToString(car);
        System.out.println(toString);
    }
}
