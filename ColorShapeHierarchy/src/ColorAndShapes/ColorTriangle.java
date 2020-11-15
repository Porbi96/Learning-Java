package ColorAndShapes;

import javafx.util.Pair;

public class ColorTriangle extends ColorShape {
    private double rotation;

    public ColorTriangle(Pair<Integer, Integer> center, double rotation, double size,  double[] colors) {
        super(center, size, colors);
        this.rotation = rotation;
    }

    @Override
    public String toString() {
        return "ColorAndShapes.Triangle with rotation " + rotation + " " + super.toString();
    }
}
