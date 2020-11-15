package ColorAndShapes;

import javafx.util.Pair;

public class Triangle extends Shape {
    private double rotation;

    public Triangle(Pair<Integer, Integer> center, double rotation, double size) {
        super(center, size);
        this.rotation = rotation;
    }

    @Override
    public String toString() {
        return "ColorAndShapes.Triangle with rotation " + rotation + " " + super.toString();
    }
}
