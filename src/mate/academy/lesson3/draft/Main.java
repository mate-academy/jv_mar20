package mate.academy.lesson3.draft;

public class Main {

    public static void main(String[] args) {
        Machine tractor = new Tractor();
        System.out.println(tractor.getWheels().size());

        Movable movable = new Movable() {
            @Override
            public void move() {
                System.out.println("anonymous movable");
            }
        };
        Movable movable1 = new MovableImpl();
        // Abstraction
    }
}
