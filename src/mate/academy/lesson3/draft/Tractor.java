package mate.academy.lesson3.draft;


// Tractor is a machine --- inheritance
// трактор являється машиною -- наслідування
public class Tractor extends Machine implements Dugable {

    @Override
    public void move() {
        super.move();
    }

    public Tractor() {
        System.out.println("Tractor constructor");
    }

    @Override
    public void dug() {
        System.out.println("Tractor can dug");
    }
}


// Abstraction is used when you have similar properties, not behaviour
