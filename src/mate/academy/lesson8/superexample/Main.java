package mate.academy.lesson8.superexample;


import java.util.ArrayList;
import java.util.List;
public class Main {
  public void doSmt()  {
    // List<? super A> means that the carList is typed to either the A class, or a superclass of A.
    // List<? extends A> means a List of objects that are instances of the class A, or subclasses of A (e.g. B and C).
    List<Car> carList = new ArrayList<>();
    carList.add(new Car());
    carList.add(new Toyota());
    carList.add(new Camry());

    consume(carList);

    List<Toyota> toyotaList = new ArrayList<>();
    toyotaList.add(new Toyota());
    toyotaList.add(new Camry());

    consume(toyotaList);
  }

  public void consume(List<? extends Car> cars) {
    Car car = cars.get(0);
  }
}

class Machine{}
class Car extends Machine{}
class Toyota extends Car{}
class Camry extends Toyota{}
