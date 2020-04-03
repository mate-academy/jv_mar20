package mate.academy.lesson3.example;

public class Main {

    //Show the example of composition:
    //
    //we want to have a carpet in our room
    //our carpet can have square or circle form

    public static void main(String[] args) {
        Size circleSize = new Size(10);
        Carpet circleCarpet = new Circle(circleSize);

        Size rectangleSize = new Size(10, 15);
        Carpet rectangleCarpet = new Rectangle(rectangleSize);

        Room kitchen = new Room(new Size(13, 13));
        Room livingRoom = new Room(new Size(100, 100));

        // круглий ковер буде в прихожій
        // прямокутний буде в кухні

        // livingRoom -- 10_000, circleCarpet -- 100
        // kitchen --- 169, rectangleCarpet --- 150

        kitchen.setCarpet(rectangleCarpet);
        livingRoom.setCarpet(circleCarpet);
    }
 }
