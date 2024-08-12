package minesweeper;

public class Main {
    public static void main(String[] args) {

        Board newGame = new Board();
        while (newGame.hasWon() == false || newGame.hasLost() == false) {
            newGame.startMenu();
            newGame.playAgain();
            continue;

        }

        // Board newGame = new Board();

        // newGame.startMenu();

        // while(newGame.hasWon()==false){
        // newGame.takeTurn();
        // }

    }

}
