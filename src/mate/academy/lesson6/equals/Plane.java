package mate.academy.lesson6.equals;

import java.util.Objects;

public class Plane {
    private int maxSpeed;
    private int weight;
    private Engine engine;
    private String color;
    private boolean isNew;

    public Plane(int maxSpeed, int weight) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return maxSpeed == plane.maxSpeed &&
                weight == plane.weight &&
                isNew == plane.isNew &&
                Objects.equals(engine, plane.engine) &&
                Objects.equals(color, plane.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpeed, weight, engine, color, isNew);
    }
}
