package mate.academy.lesson3.example;

public class Circle extends Carpet {

    public Circle(Size size) {
        super(size);
    }

    @Override
    public Double getSquare() {
        return Math.PI * size.getWidth();
    }
}
