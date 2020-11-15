package ColorAndShapes;

import javafx.util.Pair;

public class Square extends Shape {
    public Square(Pair<Integer, Integer> center, double size) {
        super(center, size);
    }

    @Override
    public String toString() {
        return "ColorAndShapes.Square " + super.toString();
    }
}
