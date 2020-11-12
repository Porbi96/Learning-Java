import java.util.ArrayList;
import java.util.Scanner;

public class ShipGame {
    private ShipMap mapMaker = new ShipMap();
    private ArrayList<Ship> shipArrayList = new ArrayList<Ship>();
    private int moveCnt = 0;

    private void prepareGame(int numberOfShips) {
        System.out.println("Preparing map...");
        for (int i = 0; i < numberOfShips; i++) {
            shipArrayList.add(new Ship());
        }

        for (Ship ship : shipArrayList) {
            ArrayList<String> location = mapMaker.placeShip(3);
            if (location != null) {
                ship.setLocation(location);
            }
        }
        System.out.println("Map is ready!");
    }

    private void startGame() {
        System.out.println("Game's starting! Shoot wisely!");
        System.out.println("Remember to write first letter (a-j), then number (0-9).");
        while (!shipArrayList.isEmpty()) {
            String playerMove = readPlayerMove();

            if (playerMove != null) {
                checkPlayerMove(playerMove);
            }
        }
        endGame();
    }

    private String readPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        String cmd = scanner.next();
        if (cmd.length() != 2) {
            System.out.println("Given string is too long/short! Try again.");
            return null;
        }
        if (ShipMap.alphabet.indexOf(Character.toLowerCase(cmd.charAt(0))) == -1 || !Character.isDigit(cmd.charAt(1))) {
            System.out.println("Given string contains wrong characters or they're in wrong order! Try again.");
            return null;
        }
        return cmd.toLowerCase();
    }

    private void checkPlayerMove(String playerMove) {
        moveCnt++;

        String result = "Miss";
        for (Ship ship : shipArrayList) {
            result = ship.check(playerMove);
            if (result.equals("Hit")) {
                break;
            } else if (result.equals("Hit and sunk")) {
                System.out.println("Ships left: " + shipArrayList.size());
                shipArrayList.remove(ship);
                break;
            }
        }
        if (result.equals("Miss")) {
            System.out.println("You missed!");
        }
    }

    private void endGame() {
        System.out.println("You win!!!");
        System.out.println("It took " + moveCnt + " moves to end game.");
    }

    public static void main(String[] args) {
        ShipGame game = new ShipGame();
        game.prepareGame(5);
        game.startGame();
    }
}
