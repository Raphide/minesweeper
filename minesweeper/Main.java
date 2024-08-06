package minesweeper;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Board newGame = new Board();

        newGame.setupGameBoard();

        //next challenge is to iterate through the board
        // row 0 and collumn 0 should be off limits
        //for user input the row has to be tied to a number. 0 also needs to default to 10.
       
        while(true){
            newGame.takeTurn();
        }

        // int A = 1;
        // int B = 2;
        // int C = 3;
        // int D = 4;
        // int E = 5;
        // int F = 6;
        // int G = 7;
        // int H = 8;
        // int I = 9;
        // int J = 10;

        // char row;
        // int column;

        

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Please enter a letter between A-J");
        // row = scanner.next().toUpperCase().charAt(0);
        // System.out.println("Please enter a number between 1-10");
        // column = scanner.nextInt();

        // System.out.printf("The row is: %c\nthe column is: %d \n", row, column);

        // HashMap<Character, Integer> enteredPositions = new HashMap<>();

        // enteredPositions.put(row, column);

        // if(enteredPositions == enteredPositions){
        //     System.out.println("entry already exists");
        // }

        

        // System.out.println(enteredPositions);

        // scanner needs to be made that will take in a HashMap<Char, Integer>
        

        
    }
    
}
