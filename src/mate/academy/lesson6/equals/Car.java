package mate.academy.lesson6.equals;

public class Car {
    private int maxSpeed;
    private int weight;
    private Engine engine;
    private String color;
    private boolean isNew;

    public Car(int maxSpeed, int weight) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public Car(int maxSpeed, int weight, Engine engine, String color, boolean isNew) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.engine = engine;
        this.color = color;
        this.isNew = isNew;
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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (getClass() != o.getClass()) {
            return false;
        }

        Car obj = (Car) o;

        return weight == obj.weight && maxSpeed == obj.maxSpeed &&
                compareEngines(obj) && (color != null && color.equals(obj.color))
                && isNew == obj.isNew;
    }

    private boolean compareEngines(Car obj) {
        // 1. Check both are null -- true
        boolean bothAreNull = engine == null && obj.engine == null;
        if (bothAreNull) {
            return true;
        }

        // 2. check at least one is null -- false
        if (engine == null || obj.engine == null) {
            return false;
        }

        // 3. compare with equals
        return engine.equals(obj.engine);
    }

    //    private int maxSpeed;
    //    private int weight;
    //    private Engine engine;
    //    private String color;
    //    private boolean isNew;
    public int hashCode() {
        int result = 1;
        result = result * 31 + maxSpeed;
        result = result * 31 + weight;
        if (engine != null) {
            result = result * 31 + engine.hashCode();
        }
        if (color != null) {
            result = result * 31 + color.hashCode();
        }
        int isNewHashCode = isNew ? 1 : 0;
        result = result * 31 + isNewHashCode;
        return result;
    }
}
