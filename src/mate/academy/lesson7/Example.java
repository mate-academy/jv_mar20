package mate.academy.lesson7;

import java.util.Optional;

import mate.academy.lesson6.equals.Car;

/**
 * Предположим, у нас есть параметризованный класс
 *
 * public class Example<X> {
 *     ...
 * }
 * Что можно подставлять в качестве значения параметра X при использовании этого класса в программе?
 *
 * 1 ) ссылку на метод (например, Object::toString)
 *
 * 2 ) имя любого интерфейса (например, CharSequence) +
 *
 * 3 ) имя любого перечисления (enum) (например, DayOfWeek) +
 *
 * 4 ) значение примитивного типа (например, 42) -
 *
 * 5 ) символ "?" или более сложное выражение с ключевыми словами extends и super +
 *
 * 6 ) имя любого класса (например, Object) +
 *
 * 7 ) имя любого примитивного типа (например, int) -
 *
 * 8 ) значение X можно не указывать, т.е. использовать класс Example как обычный непараметризованный +
 *
 * Напишите все правильные варианты ответов
 */
public class Example<X> {
    public void someMethod(Object obj) {
        X newObj = (X) obj;
        System.out.println(newObj);
    }
}

class MainExample {
    public static void main(String[] args) {
        Example<Car> example = new Example<>();
        example.someMethod(new Car(100, 20));   // Ok or not?
        example.someMethod("hello mates");                  // Ok or not?
    }
}
