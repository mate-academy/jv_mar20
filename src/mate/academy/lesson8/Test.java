package mate.academy.lesson8;

import java.util.List;

import mate.academy.lesson7.practice.Gold;
import mate.academy.lesson7.practice.SuperGold;

public class Test <T> {

    public void accept(Generic<? super T> variable) {
        Object data = variable.getData();
    }

    public void acceptData(Generic<? extends T> variable) {
        T data = variable.getData();
    }

    public Generic <? super T> get() {
        return new Generic<>();
    }

    public static void main(String[] args) {
        Test<Number> numberTest = new Test<>();
        Generic<Object> objectGeneric = new Generic<>();
        Generic<Integer> integerGeneric = new Generic<>();
        numberTest.accept(objectGeneric);
        numberTest.acceptData(integerGeneric);

        Test<Gold> goldTest = new Test<>();
        Generic<Gold> goldGeneric = new Generic<>();
        Generic<SuperGold> superGoldGeneric = new Generic<>();

        goldTest.accept(goldGeneric);
        goldTest.acceptData(superGoldGeneric);
    }
}

class Generic<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
