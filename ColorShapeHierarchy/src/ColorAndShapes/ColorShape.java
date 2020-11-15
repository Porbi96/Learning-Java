package ColorAndShapes;

import javafx.util.Pair;

public class ColorShape extends Shape{
    private Color color;

    public ColorShape(Pair<Integer, Integer> center, double size, double[] colors) {
        super(center, size);
        this.color = new Color(colors[0], colors[1], colors[2]);
    }

    public void setColor(double red, double green, double blue) {
        color.setColor(red, green, blue);
    }

    public void increaseColorBy(char cname, double percentageIncrease) {
        color.increaseColorBy(cname, percentageIncrease);
    }

    public void decreaseColorBy(char cname, double percentageIncrease) {
        color.decreaseColorBy(cname, percentageIncrease);
    }

    @Override
    public String toString() {
        return super.toString() + " " + color.toString();
    }
}
