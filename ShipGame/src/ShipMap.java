import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ShipMap {
    public static final String alphabet = "abcdefghij";
    private Integer[][] map;
    private int shipsCnt = 0;

    public ShipMap() {
        map = new Integer[10][10];
        for (Integer[] integers : map) {
            Arrays.fill(integers, 0);
        }
    }
    public ArrayList<String> placeShip(int shipSize) {
        int row_start = 0;
        int col_start = 0;
        int maxTries = 100;
        boolean isPlaced = false;
        boolean foundPlace;

        ArrayList<String> location = new ArrayList<String>();
        while (true) {
            foundPlace = true;
            row_start = ThreadLocalRandom.current().nextInt(0,8);
            col_start = ThreadLocalRandom.current().nextInt(0,8);

            if (shipsCnt % 2 == 0) {
                for (int i = 0; i < shipSize; i++) {
                    if (map[row_start+i][col_start] != 0) {
                        foundPlace = false;
                        break;
                    }
                }
            } else {
                for (int i = 0; i < shipSize; i++) {
                    if (map[row_start][col_start+i] != 0) {
                        foundPlace = false;
                        break;
                    }
                }
            }

            if (foundPlace) {
                if (shipsCnt % 2 == 0) {
                    for (int i = 0; i < shipSize; i++) {
                        map[row_start+i][col_start] = 1;
                        location.add(alphabet.charAt(row_start+i) + (new Integer(col_start)).toString());
                    }
                } else {
                    for (int i = 0; i < shipSize; i++) {
                        map[row_start][col_start+i] = 1;
                        location.add(alphabet.charAt(row_start) + (new Integer(col_start+i)).toString());
                    }
                }
                shipsCnt++;
                break;
            }
            if (--maxTries <= 0) {
                System.out.println("Cannot find free place for the ship!");
                return null;
            }
        }
        return location;

    }
}
