import javafx.util.Pair;
import java.util.ArrayList;

import ColorAndShapes.*;

public class Main {
    public static void main(String[] args) {
        ColorTriangle a = new ColorTriangle(new Pair<Integer, Integer>(0, 0), 30, 25, new double[]{20, 20, 120});
        System.out.println(a);
        a.setColor(100,0,70);
        System.out.println(a);
        a.increaseColorBy('r', 2.0); // red = red + red * 2
        System.out.println(a);
        ColorSquare b = new ColorSquare(new Pair<Integer, Integer>(3, 3), 12, new double[]{20, 20, 120});
        b.setColor(10, 255, 0);
        b.decreaseColorBy('g', 0.3);
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Triangle(new Pair<Integer, Integer>(0, 0), 90, 50));
        shapes.add(a);
        shapes.add(new Square(new Pair<Integer, Integer>(3, -1),10));
        shapes.add(b);

        for (Shape e : shapes) {
            System.out.println(e);
        }
    }
}
