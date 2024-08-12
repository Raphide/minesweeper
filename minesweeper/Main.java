package minesweeper;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Board newGame = new Board();
            newGame.startMenu();
            if (newGame.hasWon() == false && newGame.isLost() == false) {
                newGame.takeTurn();
                continue;
            }
        }

    }

}
