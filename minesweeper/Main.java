package minesweeper;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Board newGame = new Board();

        newGame.setupGameBoard();
       
        while(newGame.hasWon()==false){
            newGame.takeTurn();
        }

    }
    
}
