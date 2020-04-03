package mate.academy.lesson3.example;

public class Room implements Sizable {
    private Size size;
    private Carpet carpet;

    public Room(Size size) {
        this.size = size;
    }

    public void setCarpet(Carpet carpet) {
        if (carpet.getSquare() > getSquare()) {
            System.out.println("Carpet is loo large");
        } else {
            this.carpet = carpet;
        }
    }

    @Override
    public Double getSquare() {
        return (double) size.getLength() * size.getLength();
    }
}
