package mate.academy.lesson6;

public class HashCodeExample {

    Rectangle rectangle1 = new Rectangle(10, 20); // 30 || // 320
    Rectangle rectangle2 = new Rectangle(15, 15); // 30 || // 470


}

class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int hashCode() {
        return 10;
    }
}
