package ColorAndShapes;

import javafx.util.Pair;

public class ColorSquare extends ColorShape {
    public ColorSquare(Pair<Integer, Integer> center, double size,  double[] colors) {
        super(center, size, colors);
    }

    @Override
    public String toString() {
        return "ColorAndShapes.Square " + super.toString();
    }
}
