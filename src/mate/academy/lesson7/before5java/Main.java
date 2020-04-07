package mate.academy.lesson7.before5java;

import java.util.Arrays;

import mate.academy.lesson6.equals.Car;
import mate.academy.lesson7.practice.Gold;
import mate.academy.lesson7.practice.Milk;

// Реализовать класс коробка и поместить в него золото
public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Gold gold = new Gold();
        gold.setValue(100);

        box.setData(gold);

        Box milkBox = new Box();
        Milk milk = new Milk();
        milkBox.setData(milk);
        box.setData(milk); /// not possible with Generics!!!
        Milk data = (Milk) milkBox.getData(); // we need to use casting without Generics
        System.out.println(data);


        ArrayHolder<Car> cars = new ArrayHolder<>();
        cars.add(new Car(100, 30));
    }
}
