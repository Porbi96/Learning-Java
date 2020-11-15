package ColorAndShapes;

import javafx.util.Pair;

public class Shape {
    private double size;
    private Pair<Integer, Integer> center;

    public Shape(Pair<Integer, Integer> center, double size) {
        this.size = size;
        this.center = center;
    }

    @Override
    public String toString() {
        return "of side size " + size + ", at center " + center.toString();
    }
}
