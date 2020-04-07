package mate.academy.lesson7.practice;

// Реализовать класс коробка и поместить в него золото
public class Main {
    public static void main(String[] args) {
        Box<Gold> box = new Box<>();
        Gold gold = new Gold();
        gold.setValue(100);

        box.setData(gold);

        SuperGold superGold = new SuperGold();
        box.setData(superGold);

        Box<Milk> milkBox = new Box<>();
        Milk milk = new Milk();
        milkBox.setData(milk);
        Milk data = milkBox.getData();
    }
}
