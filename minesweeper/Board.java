package minesweeper;

import java.util.HashMap;
import java.util.Scanner;

public class Board {

    private String header = "<==<<====<< MINESWEEPER >>===>>==>";

    private String[][] matrix = {
            { "+", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" },
            { "A", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X" },
            { "B", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X" },
            { "C", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X" },
            { "D", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X" },
            { "E", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X" },
            { "F", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X" },
            { "G", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X" },
            { "H", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X" },
            { "I", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X" },
            { "J", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X" }
    };

    // matrixClone "O" = mine
    // to-do: generate random position to replace "X" with "O"
    private String[][] matrixClone = {
            { "+", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" },
            { "A", "X", "X", "X", "X", "O", "X", "X", "X", "X", "O" },
            { "B", "X", "X", "X", "X", "X", "O", "X", "X", "X", "X" },
            { "C", "X", "X", "O", "X", "X", "X", "X", "X", "X", "X" },
            { "D", "X", "X", "X", "X", "X", "X", "X", "O", "X", "X" },
            { "E", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X" },
            { "F", "X", "X", "X", "X", "O", "X", "X", "X", "X", "X" },
            { "G", "X", "X", "X", "X", "X", "O", "X", "X", "X", "X" },
            { "H", "X", "X", "O", "O", "X", "X", "X", "X", "X", "X" },
            { "I", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X" },
            { "J", "X", "X", "X", "X", "X", "X", "X", "X", "O", "X" }
    };

    private HashMap<Integer, Character> enteredPositions = new HashMap<>();

    public Board() {
        this.header = header;
        this.matrix = matrix;
        this.enteredPositions = enteredPositions; // this will store positions that have already been used.
        this.matrixClone = matrixClone; // this will be the hidden board
    }

    public void setupGameBoard() {

        System.out.println(header);

        // j = columns
        // i = rows

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("|%s|", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void updateGameBoard() {
        System.out.println(header);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("|%s|", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println(enteredPositions);

    }

    public void takeTurn(){
        char row;
        int column;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a letter between A-J");
        char rowCheck = scanner.next().toUpperCase().charAt(0);
        if (rowCheck != 'A' || rowCheck != 'B' || rowCheck != 'C' || rowCheck !=
        'D' || rowCheck != 'E'|| rowCheck != 'F' || rowCheck != 'G' || rowCheck !=
        'H' || rowCheck != 'I' || rowCheck != 'J') {
            System.out.println("please enter a valid character");
        } 
        row = rowCheck;
        System.out.println("Please enter a number between 1-10");
        column = scanner.nextInt();

        System.out.printf("The row is: %c\nthe column is: %d \n", row, column);

        enteredPositions.put(column, row);

        updateGameBoard();

       


    }

    public void charToInt(char rowInput) {
        // // to convert a character to an int

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
        // switch (rowInput) {
        //     case 'A':
        //         return A;
        //         break;
        //     case 'B':
        //         return B;
        // }
    }

    public void selectRow(char rowInput) {
        // this function to replace an entire row with
        // {"A","O","O","O","O","O","O","O","O","O","O"}
        // to indicate to user that this is the row they have selected
    }

}
