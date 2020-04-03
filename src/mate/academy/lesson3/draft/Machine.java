package mate.academy.lesson3.draft;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Machine implements Movable {
    private String color;
    private String model;
    private LocalDateTime creationTime;

    // Machine has a whhels --- composition
    // машина має колеса --- композиція
    private List<Wheel> wheels = new ArrayList<>();
    private Engine engineType;

    public Machine() {
        System.out.println("car constructor");
        creationTime = LocalDateTime.now();
    }

    @Override
    public void move() {
        print();
        System.out.println("Car is moving");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public Engine getEngineType() {
        return engineType;
    }

    public void setEngineType(Engine engineType) {
        this.engineType = engineType;
    }
}
