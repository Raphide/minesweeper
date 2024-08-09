package minesweeper.testing;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // // ==========================================================================

        String[][] header = {
                { "███╗   ███╗██╗███╗   ██╗███████╗███████╗██╗    ██╗███████╗███████╗██████╗ ███████╗██████╗ " },
                { "████╗ ████║██║████╗  ██║██╔════╝██╔════╝██║    ██║██╔════╝██╔════╝██╔══██╗██╔════╝██╔══██╗" },
                { "██╔████╔██║██║██╔██╗ ██║█████╗  ███████╗██║ █╗ ██║█████╗  █████╗  ██████╔╝█████╗  ██████╔╝" },
                { "██║╚██╔╝██║██║██║╚██╗██║██╔══╝  ╚════██║██║███╗██║██╔══╝  ██╔══╝  ██╔═══╝ ██╔══╝  ██╔══██╗" },
                { "██║ ╚═╝ ██║██║██║ ╚████║███████╗███████║╚███╔███╔╝███████╗███████╗██║     ███████╗██║  ██║" },
                { "╚═╝     ╚═╝╚═╝╚═╝  ╚═══╝╚══════╝╚══════╝ ╚══╝╚══╝ ╚══════╝╚══════╝╚═╝     ╚══════╝╚═╝  ╚═╝" }
        };

        String[][] matrixClone = {
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

        int[][] intMatrix = {
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

        String[][] winner = {
            { "██╗    ██╗██╗███╗   ██╗███╗   ██╗███████╗██████╗ ██╗" },
            { "██║    ██║██║████╗  ██║████╗  ██║██╔════╝██╔══██╗██║" },
            { "██║ █╗ ██║██║██╔██╗ ██║██╔██╗ ██║█████╗  ██████╔╝██║" },
            { "██║███╗██║██║██║╚██╗██║██║╚██╗██║██╔══╝  ██╔══██╗╚═╝" },
            { "╚███╔███╔╝██║██║ ╚████║██║ ╚████║███████╗██║  ██║██╗" },
            { " ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝╚═╝" }
    };

        // =================== board set up =====================================

        for (int y = 0; y < winner.length; y++) {
            for (int j = 0; j < 1; j++) {
                System.out.printf(winner[y][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < intMatrix.length; i++) {
            for (int j = 0; j < intMatrix.length; j++) {
                // System.out.printf("|%s|", intMatrix[i][j]);
            }
            // System.out.println();
        }

        // this sets up the bombs randomly
        // to-do: make sure each coordinate is unique
        var n = 0;
        while (n < 10) {
            int randomRow = (int) Math.floor(Math.random() * (9 - 0));
            int randomColumn = (int) Math.floor(Math.random() * (9 - 0));
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

        // not necessary to print out bomb board unless you want to check bomb
        // placement. Don't be a cheater :)
        for (int i = 0; i < intMatrix.length; i++) {
            for (int j = 0; j < intMatrix.length; j++) {
                System.out.printf("|%s|", intMatrix[i][j]);
            }

            System.out.println();

        }

        // ================== game setup =========================================
        Scanner scanToStart = new Scanner(System.in);
        System.out.println("Press enter to start");
        String start = scanToStart.nextLine();
        System.out.println("");
        for (int i = 0; i < header.length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.printf(header[i][j]);
            }
            System.out.println();
        }
        System.out.println("");

        for (int i = 0; i < matrixClone.length; i++) {
            for (int j = 0; j < matrixClone.length; j++) {
                System.out.printf("|%s|", matrixClone[i][j]);
            }
            System.out.println();
        }
        System.out.println("enter a row letter between A-J");

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
                continue;
            }

            var coordValue = String.valueOf(intMatrix[r - 1][c - 1]);
            matrixClone[r][c] = coordValue;
            if (intMatrix[r - 1][c - 1] == 9) {
                matrixClone[r][c] = "!";
                for (int i = 0; i < matrixClone.length; i++) {
                    for (int j = 0; j < matrixClone.length; j++) {
                        System.out.printf("|%s|", matrixClone[i][j]);
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
                matrixClone[r][c] = coordValue;
                for (int i = 0; i < matrixClone.length; i++) {
                    for (int j = 0; j < matrixClone.length; j++) {
                        System.out.printf("|%s|", matrixClone[i][j]);
                    }
                    System.out.println();
                }
                System.out.printf("%s%d \n", ro, c);
                System.out.println("You're safe... for now...");
                System.out.println("enter a row number between 1-10");
            }

        }

    }
}
