package mate.academy.lesson3.draft;

public interface Movable {
    public abstract void move();

    default void print(){
        System.out.println("I am print in the interface");
    }
}

// 1. Interface does not have variables, only constants
// 2. Interface does not have a constructors
// 3. We can implements many interfaces, but extend only one class

// SOLID --- Interface Segregation
// S - Single responsibility principle
