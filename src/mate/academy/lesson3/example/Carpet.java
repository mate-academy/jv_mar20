package mate.academy.lesson3.example;

public abstract class Carpet implements Sizable {
    protected Size size;

    public Carpet(Size size) {
        this.size = size;
    }
}
