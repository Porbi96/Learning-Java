import java.util.ArrayList;

public class Ship {
    private ArrayList<String> location;

    public void setLocation(ArrayList<String> location) {
        this.location = location;
    }

    public String check(String point) {
        String result = "Miss";

        int idx = location.indexOf(point);
        if (idx >= 0) {
            location.remove(idx);
            System.out.println("You hit a ship!");
            result = "Hit";
            if (location.isEmpty()) {
                System.out.println("Ship has been destroyed!");
                result = "Hit and sunk";
            }
        }
        return result;
    }
}
