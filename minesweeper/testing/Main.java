package minesweeper.testing;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // char bomb = 'b';
        // char safe = 's';
        // String[][] beebo = new String[10][10];
        // for (int i = 0; i < 10; i++) {
        // for (int j = 0; j < 10; j++) {
        // System.out.printf("|" + safe + "|", beebo[i][j]);
        // }
        // System.out.println();
        // }

        // beebo[2][7] = "X";

        // for (int i = 0; i < beebo.length; i++) {
        // for (int j = 0; j < beebo.length; j++) {
        // System.out.printf("|%s|", beebo[i][j]);
        // }
        // System.out.println();
        // }

        // // ==========================================================================

        String[][] matrix = {
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

        String[][] setMatrix = {
                { "+", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" },
                { "A", "1", "1", "1", "X", "X", "X", "X", "1", "O", "1" },
                { "B", "1", "O", "1", "X", "X", "X", "X", "1", "1", "1" },
                { "C", "1", "1", "1", "X", "X", "X", "X", "X", "X", "X" },
                { "D", "1", "1", "X", "X", "1", "1", "1", "X", "1", "1" },
                { "E", "O", "2", "1", "1", "2", "O", "2", "X", "1", "O" },
                { "F", "1", "2", "O", "2", "3", "O", "2", "X", "1", "1" },
                { "G", "X", "1", "2", "O", "2", "1", "1", "X", "X", "X" },
                { "H", "X", "1", "2", "1", "X", "X", "X", "X", "X", "X" },
                { "I", "X", "X", "X", "1", "1", "1", "1", "1", "1", "X" },
                { "J", "X", "X", "X", "1", "O", "1", "1", "O", "1", "X" }
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

        String[][] header = {
            {"███╗   ███╗██╗███╗   ██╗███████╗███████╗██╗    ██╗███████╗███████╗██████╗ ███████╗██████╗ "},
            {"████╗ ████║██║████╗  ██║██╔════╝██╔════╝██║    ██║██╔════╝██╔════╝██╔══██╗██╔════╝██╔══██╗"},
            {"██╔████╔██║██║██╔██╗ ██║█████╗  ███████╗██║ █╗ ██║█████╗  █████╗  ██████╔╝█████╗  ██████╔╝"},
            {"██║╚██╔╝██║██║██║╚██╗██║██╔══╝  ╚════██║██║███╗██║██╔══╝  ██╔══╝  ██╔═══╝ ██╔══╝  ██╔══██╗"},
            {"██║ ╚═╝ ██║██║██║ ╚████║███████╗███████║╚███╔███╔╝███████╗███████╗██║     ███████╗██║  ██║"},
            {"╚═╝     ╚═╝╚═╝╚═╝  ╚═══╝╚══════╝╚══════╝ ╚══╝╚══╝ ╚══════╝╚══════╝╚═╝     ╚══════╝╚═╝  ╚═╝"}
        };

        String[][] matrixClone = {
            { "+", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" },
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
        String[][] matrixCoord = {
                { "+", "1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "0  " },
                { "A", "a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8", "a9", "a10" },
                { "B", "b1", "b2", "b3", "b4", "b5", "b6", "b7", "b8", "b9", "b10" },
                { "C", "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10" },
                { "D", "d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10" },
                { "E", "e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8", "e9", "e10" },
                { "F", "f1", "f2", "f3", "f4", "f5", "f6", "f7", "f8", "f9", "f10" },
                { "G", "g1", "g2", "g3", "g4", "g5", "g6", "g7", "g8", "g9", "g10" },
                { "H", "h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "h10" },
                { "I", "i1", "i2", "i3", "i4", "i5", "i6", "i7", "i8", "i9", "i10" },
                { "J", "j1", "j2", "j3", "j4", "j5", "j6", "j7", "j8", "j9", "j10" }
        };

        // System.out.println(matrixClone[0][0]);
        // System.out.println(matrixClone[2][7]);
        // System.out.println(matrixClone[4][3]);

        // =================== board set up =====================================

        //    // this creates the bomb board for true random mode
        // // --------------------------------------------------------------
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix.length; j++) {
        //         // System.out.printf("|%s|", matrix[i][j]);
        //     }
        //     // System.out.println();
        // }

         //       // this sets up the bombs randomly
        //  // to-do: make sure each coordinate is unique
        // var n = 0;
        // while (n < 10) {
        //     int randomRow = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
        //     int randomColumn = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
        //     matrix[randomRow][randomColumn] = "O";
        //     // if coordinate does not equal an already entered coordinate then do not run
        //     // the below code
        //     n = n + 1;
        // }

        //  // not necessary to print out bomb board unless you want to check bomb placement. Don't be a cheater :)
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix.length; j++) {
        // System.out.printf("|%s|", matrix[i][j]);
        // }

        // System.out.println();

        // }
        //  // ------------------------------------------------------------------------

        //    // this creates the bomb board for set mode
        // // --------------------------------------------------------------
        for (int i = 0; i < setMatrix.length; i++) {
            for (int j = 0; j < setMatrix.length; j++) {
                // System.out.printf("|%s|", matrix[i][j]);
            }
            // System.out.println();
        }


        // ================== game setup =========================================
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
        System.out.println("enter a row number between 1-10");

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            int r = scanner.nextInt();
            System.out.println("enter a column number between 1-10");
            int c = scanner.nextInt();

            // // true random mode. No bomb indicators

            // matrixClone[r][c] = matrix[r][c]; // THIS IS SOMETHING
            // if (matrix[r][c] == "O") {
            //     matrixClone[r][c] = "Loser";
            //     for (int i = 0; i < boom.length; i++) {
            //         for (int j = 0; j < 1; j++) {
            //             System.out.printf(boom[i][j]);
            //         }
            //         System.out.println();
            //     }
            //     System.out.println("You lose :(");
            //     // scanner.close();
            //     break;
            // } else {
            //     matrixClone[r][c] = matrix[r][c];
            //     for (int i = 0; i < matrixClone.length; i++) {
            //         for (int j = 0; j < matrixClone.length; j++) {
            //             System.out.printf("|%s|", matrixClone[i][j]);
            //         }
            //         System.out.println();
            //     }
            //     System.out.println("You're safe... for now...");
            //     System.out.println("enter a row number between 1-10");
            // }

            // // set mode with bomb indicators

            matrixClone[r][c] = setMatrix[r][c]; // THIS IS SOMETHING
            if (setMatrix[r][c] == "O") {
                matrixClone[r][c] = "Loser";
                for (int i = 0; i < boom.length; i++) {
                    for (int j = 0; j < 1; j++) {
                        System.out.printf(boom[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("You lose :(");
                break;
            } else {
                matrixClone[r][c] = setMatrix[r][c];
                for (int i = 0; i < matrixClone.length; i++) {
                    for (int j = 0; j < matrixClone.length; j++) {
                        System.out.printf("|%s|", matrixClone[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("You're safe... for now...");
                System.out.println("enter a row number between 1-10");
            }


        }

    }
}
