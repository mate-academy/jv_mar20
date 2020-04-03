package mate.academy.lesson3.example;

public class Rectangle extends Carpet {
    public Rectangle(Size size) {
        super(size);
    }

    @Override
    public Double getSquare() {
        return (double) size.getLength() * size.getWidth();
    }
}
