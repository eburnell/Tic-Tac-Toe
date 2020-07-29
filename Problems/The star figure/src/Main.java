import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numLines = input.nextInt();
        char[][] matrix = new char[numLines][numLines];

        //populate matrix
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < numLines; j++) {
                matrix[i][j] = '.';
            }
        }

        //create star
        //fill middle row/column with *
        //fill diagonals with *
        for (int i = 0; i < numLines; i++) {
            matrix[numLines / 2][i] = '*';
            matrix[i][numLines / 2] = '*';
            matrix[i][i] = '*';
            matrix[numLines - 1 - i][i] = '*';
        }

        //print matrix
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < numLines; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}