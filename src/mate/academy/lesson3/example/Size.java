package mate.academy.lesson3.example;

public class Size {
    private int width;
    private int length;

    public Size(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public Size(int width) {
        this.width = width;
        this.length = width;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
