package minesweeper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Board {

    private String[][] header = {
            { "███╗   ███╗██╗███╗   ██╗███████╗███████╗██╗    ██╗███████╗███████╗██████╗ ███████╗██████╗ " },
            { "████╗ ████║██║████╗  ██║██╔════╝██╔════╝██║    ██║██╔════╝██╔════╝██╔══██╗██╔════╝██╔══██╗" },
            { "██╔████╔██║██║██╔██╗ ██║█████╗  ███████╗██║ █╗ ██║█████╗  █████╗  ██████╔╝█████╗  ██████╔╝" },
            { "██║╚██╔╝██║██║██║╚██╗██║██╔══╝  ╚════██║██║███╗██║██╔══╝  ██╔══╝  ██╔═══╝ ██╔══╝  ██╔══██╗" },
            { "██║ ╚═╝ ██║██║██║ ╚████║███████╗███████║╚███╔███╔╝███████╗███████╗██║     ███████╗██║  ██║" },
            { "╚═╝     ╚═╝╚═╝╚═╝  ╚═══╝╚══════╝╚══════╝ ╚══╝╚══╝ ╚══════╝╚══════╝╚═╝     ╚══════╝╚═╝  ╚═╝" }
    };

    private String[][] matrix = {
            { "+", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" },
            { "A", "■", "■", "■", "■", "■", "■", "■", "■", "■", "■" },
            { "B", "■", "■", "■", "■", "■", "■", "■", "■", "■", "■" },
            { "C", "■", "■", "■", "■", "■", "■", "■", "■", "■", "■" },
            { "D", "■", "■", "■", "■", "■", "■", "■", "■", "■", "■" },
            { "E", "■", "■", "■", "■", "■", "■", "■", "■", "■", "■" },
            { "F", "■", "■", "■", "■", "■", "■", "■", "■", "■", "■" },
            { "G", "■", "■", "■", "■", "■", "■", "■", "■", "■", "■" },
            { "H", "■", "■", "■", "■", "■", "■", "■", "■", "■", "■" },
            { "I", "■", "■", "■", "■", "■", "■", "■", "■", "■", "■" },
            { "J", "■", "■", "■", "■", "■", "■", "■", "■", "■", "■" }
    };

    private int[][] intMatrix = {
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
    };

    String[][] boom = {
            { "-███████████-----███████-------███████----██████---██████-███" },
            { "░░███░░░░░███--███░░░░░███---███░░░░░███-░░██████-██████-░███" },
            { "-░███----░███-███-----░░███-███-----░░███-░███░█████░███-░███" },
            { "-░██████████-░███------░███░███------░███-░███░░███-░███-░███" },
            { "-░███░░░░░███░███------░███░███------░███-░███-░░░--░███-░███" },
            { "-░███----░███░░███-----███-░░███-----███--░███------░███-░░░-" },
            { "-███████████--░░░███████░---░░░███████░---█████-----█████-███" },
            { "░░░░░░░░░░░-----░░░░░░░-------░░░░░░░----░░░░░-----░░░░░-░░░-" }
    };

    private String[][] winner = {
            { "██╗    ██╗██╗███╗   ██╗███╗   ██╗███████╗██████╗ ██╗" },
            { "██║    ██║██║████╗  ██║████╗  ██║██╔════╝██╔══██╗██║" },
            { "██║ █╗ ██║██║██╔██╗ ██║██╔██╗ ██║█████╗  ██████╔╝██║" },
            { "██║███╗██║██║██║╚██╗██║██║╚██╗██║██╔══╝  ██╔══██╗╚═╝" },
            { "╚███╔███╔╝██║██║ ╚████║██║ ╚████║███████╗██║  ██║██╗" },
            { " ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝╚═╝" }
    };

    private ArrayList<String> enteredCoordinates = new ArrayList<>();

    public Board() {
        this.header = header;
        this.matrix = matrix;
        this.enteredCoordinates = enteredCoordinates; // this will store positions that have already been used.
        this.intMatrix = intMatrix; // this will be the hidden board
    }

    public void printGameBoard() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("|%s|", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("enter a row letter between A-J");
    }

    public void createIntMatrix() {

        for (int i = 0; i < intMatrix.length; i++) {
            for (int j = 0; j < intMatrix.length; j++) {
            }
        }

        var n = 0;
        while (n < 10) {
            int randomRow = (int) Math.floor(Math.random() * (10 - 0));
            int randomColumn = (int) Math.floor(Math.random() * (10 - 0));
            if (intMatrix[randomRow][randomColumn] != 9) {
                intMatrix[randomRow][randomColumn] = 9;

                if (randomRow < 9 && intMatrix[randomRow + 1][randomColumn] < 9) { // south
                    intMatrix[randomRow + 1][randomColumn]++;
                }
                if (randomRow > 0 && intMatrix[randomRow - 1][randomColumn] < 9) { // north
                    intMatrix[randomRow - 1][randomColumn]++;
                }
                if (randomRow < 9 && randomColumn < 9 && intMatrix[randomRow + 1][randomColumn + 1] < 9) { // south east
                    intMatrix[randomRow + 1][randomColumn + 1]++;
                }
                if (randomRow > 0 && randomColumn > 0 && intMatrix[randomRow - 1][randomColumn - 1] < 9) { // north west
                    intMatrix[randomRow - 1][randomColumn - 1]++;
                }
                if (randomRow > 0 && randomColumn < 9 && intMatrix[randomRow - 1][randomColumn + 1] < 9) { // north east
                    intMatrix[randomRow - 1][randomColumn + 1]++;
                }
                if (randomRow < 9 && randomColumn > 0 && intMatrix[randomRow + 1][randomColumn - 1] < 9) { // south west
                    intMatrix[randomRow + 1][randomColumn - 1]++;
                }
                if (randomColumn < 9 && intMatrix[randomRow][randomColumn + 1] < 9) { // east
                    intMatrix[randomRow][randomColumn + 1]++;
                }
                if (randomColumn > 0 && intMatrix[randomRow][randomColumn - 1] < 9) { // west
                    intMatrix[randomRow][randomColumn - 1]++;
                }

            }
            n = n + 1;
        }

        // // not necessary to print out bomb board unless you want to check bomb
        // // placement. Don't be a cheater :)
        // for (int i = 0; i < intMatrix.length; i++) {
        // for (int j = 0; j < intMatrix.length; j++) {
        // System.out.printf("|%s|", intMatrix[i][j]);
        // }

        // System.out.println();

        // }

    }

    public void setupGameBoard() {
        // j = columns
        // i = rows
        for (int i = 0; i < header.length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.printf(header[i][j]);
            }
            System.out.println();
        }
        System.out.println("");

        createIntMatrix();
        printGameBoard();

    }

    public void takeTurn() {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            var r = 1;
            char ro = scanner.next().toUpperCase().charAt(0);

            if (ro == 'A') {
                r = 1;
            } else if (ro == 'B') {
                r = 2;
            } else if (ro == 'C') {
                r = 3;
            } else if (ro == 'D') {
                r = 4;
            } else if (ro == 'E') {
                r = 5;
            } else if (ro == 'F') {
                r = 6;
            } else if (ro == 'G') {
                r = 7;
            } else if (ro == 'H') {
                r = 8;
            } else if (ro == 'I') {
                r = 9;
            } else if (ro == 'J') {
                r = 10;
            } else {
                System.out.println("Please enter a valid character");
                continue;
            }

            System.out.println("enter a column number between 1-10");
            int c = scanner.nextInt();
            if (c > 10) {
                System.out.println("Please enter a valid number");
                System.out.println("enter a row letter between A-J");
                continue;
            }

            String coordinate = ro + String.valueOf(c);
            if (enteredCoordinates.contains(coordinate)) {
                System.out.println("This coordinate has already been revealed");
                System.out.println("enter a row letter between A-J");
                continue;
            }
            var coordValue = String.valueOf(intMatrix[r - 1][c - 1]);
            matrix[r][c] = coordValue;
            if (intMatrix[r - 1][c - 1] == 9) {
                matrix[r][c] = "!";
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.printf("|%s|", matrix[i][j]);
                    }
                    System.out.println();
                }
                for (int i = 0; i < boom.length; i++) {
                    for (int j = 0; j < 1; j++) {
                        System.out.printf(boom[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("You lose :(");
                break;
            } else {
                matrix[r][c] = coordValue;
                enteredCoordinates.add(coordinate);
                printGameBoard();
                hasWon();
            }
            if (hasWon() == false) {
                System.out.printf(coordinate + "\n");
                System.out.println("You're safe... for now...");
                // System.out.printf(enteredCoordinates.toString() + "\n");
                System.out.println("enter a row letter between A-J");
            } else {
                for (int i = 0; i < winner.length; i++) {
                    for (int j = 0; j < 1; j++) {
                        System.out.printf(winner[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("YOU WIN!!!");
                break;
            }
        }

    }

    public boolean hasWon() {
        if (enteredCoordinates.size() == 90) {
            return true;
        }
        return false;
    }
}
