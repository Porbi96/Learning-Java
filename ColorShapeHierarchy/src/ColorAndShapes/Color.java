package ColorAndShapes;

public class Color{
    private Double red = (double) 0;
    private Double green = (double) 0;
    private Double blue = (double) 0;

    public Color(double r, double g, double b) {
        red = r;
        green = g;
        blue = b;
    }

    public void setColor(double red, double green, double blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    private Double checkValueIfInRange(Double color) {
        if (color > 255) {return (double)255;}
        else if (color < 0) {return (double)0;}
        else {return color;}
    }

    public void increaseColorBy(char cname, double percentageIncrease) {
        switch (cname) {
            case 'r':
                red += red*percentageIncrease;
                red = checkValueIfInRange(red);
                break;

            case 'g':
                green += green*percentageIncrease;
                green = checkValueIfInRange(green);

            case 'b':
                blue += blue*percentageIncrease;
                blue = checkValueIfInRange(blue);
        }
    }

    public void decreaseColorBy(char cname, double percentageIncrease) {
        switch (cname) {
            case 'r':
                red -= red*percentageIncrease;
                red = checkValueIfInRange(red);
                break;

            case 'g':
                green -= green*percentageIncrease;
                green = checkValueIfInRange(green);

            case 'b':
                blue -= blue*percentageIncrease;
                blue = checkValueIfInRange(blue);
        }
    }

    @Override
    public String toString() {
        return "of color r:" + red + " g:" + green + " b:" + blue;
    }
}
