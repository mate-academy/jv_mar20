package mate.academy.lesson6.equals;

import java.io.File;
import java.util.Objects;

public class Engine {
    private double volume;
    private String type;

    public Engine(double volume, String type) {
        this.volume = volume;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        double a = 0.1;
        double b = 0.2;
        double c = a + b; // 0.3 ---> 0.3000000000000001
        return Double.compare(engine.volume, volume) == 0 &&
                Objects.equals(type, engine.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, type);
    }

    public static int[] rowWeights (final int[] weights) {
        while (true) {
            File file = new File("path");
            System.out.println("hello");
        }
    }
}
