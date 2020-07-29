package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // create and populate the 3x3 board
        Scanner input = new Scanner(System.in);
        String border = "---------";
        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '_';
            }
        }

        // initial print of empty board
        System.out.println(border);
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("|\n");
        }
        System.out.println(border);

        boolean isGameOver = false;
        int turnNumber = 1;

        while (!isGameOver) {
            //ask the user about the next move as X
            // user enters 2 numbers indicative of move placement
            // (1, 3) (2, 3) (3, 3)
            // (1, 2) (2, 2) (3, 2)
            // (1, 1) (2, 1) (3, 1)
            boolean cellPlaced = false;
            int col = 0;
            int row = 0;

            while (!cellPlaced) {
                System.out.print("Enter the coordinates: ");
                String coord = input.nextLine();
                if (Character.isDigit(coord.charAt(0))) {
                    if (coord.charAt(0) > '3' || coord.charAt(0) < '1') {
                        System.out.println("Coordinates should be from 1 to 3!");
                    } else {
                        col = Integer.parseInt(String.valueOf(coord.charAt(0)));
                        if (coord.charAt(2) > '3' || coord.charAt(2) < '1') {
                            System.out.println(("Coordinates should be from 1 to 3!"));
                        } else {
                            if (Character.isDigit(coord.charAt(2))) {
                                row = Integer.parseInt(String.valueOf(coord.charAt(2)));

                                if (board[3 - row][col - 1] == '_') {
                                    if (turnNumber % 2 == 0) {
                                        board[3 - row][col - 1] = 'O';
                                    } else {
                                        board[3 - row][col - 1] = 'X';
                                    }
                                    cellPlaced = true;
                                } else {
                                    System.out.println("This cell is occupied! Choose another one!");
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("You should enter numbers!");
                }
            }

            //print the field with user's new move
            System.out.println(border);
            for (int i = 0; i < board.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.print("|\n");
            }
            System.out.println(border);


            //analyze game state
            boolean emptySpaces = false;
            boolean threeX = false;
            int numX = 0;
            boolean threeO = false;
            int numO = 0;

            //count number
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 'O') {
                        numO++;
                    } else if (board[i][j] == 'X') {
                        numX++;
                    } else {
                        emptySpaces = true;
                    }
                }
                //check horizontals
                if (board[i][0] == 'X' &&
                        board[i][1] == 'X' &&
                        board[i][2] == 'X') {
                    threeX = true;
                } else if (board[i][0] == 'O' &&
                        board[i][1] == 'O' &&
                        board[i][2] == 'O') {
                    threeO = true;
                }
            }

            //check verticals
            for (int i = 0; i < 3; i++) {
                if (board[0][i] == 'X' &&
                        board[1][i] == 'X' &&
                        board[2][i] == 'X') {
                    threeX = true;
                } else if (board[0][i] == 'O' &&
                        board[1][i] == 'O' &&
                        board[2][i] == 'O') {
                    threeO = true;
                }
            }

            //check diagonals
            if ((board[0][0] == board[1][1] &&
                    board[0][0] == board[2][2]) ||
                    (board[0][2] == board[1][1] &&
                            board[0][2] == board[2][0])) {
                if (board[1][1] == 'O') {
                    threeO = true;
                } else if (board[1][1] == 'X') {
                    threeX = true;
                }
            }

            if (threeX && !threeO) {
                System.out.println("X wins");
                isGameOver = true;
            } else if (!threeX && threeO) {
                System.out.println("O wins");
                isGameOver = true;
            } else if (!threeX && !threeO && !emptySpaces) {
                System.out.println("Draw");
                isGameOver = true;
            }
//            else if (threeX && threeO ||
//                    ((numO + 1 != numX ||
//                            numX + 1 != numO) &&
//                            numO != numX)) {
//                System.out.println("Impossible");
//                isGameOver = true;
//            } else if (!threeX && !threeO && emptySpaces) {
//                System.out.println("Game not finished");
//                isGameOver = false;
//            }

            turnNumber++;
        }
    }
}
