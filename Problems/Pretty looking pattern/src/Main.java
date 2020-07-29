import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] matrix = new char[4][4];
        String newline = input.nextLine();
        boolean isPretty = true;

        //populate matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = newline.charAt(j);
            }
            if (i < 3) {
                newline = input.nextLine();
            }
        }

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[i][j] == matrix[i + 1][j] &&
                    matrix[i][j] == matrix[i][j + 1] &&
                    matrix[i][j] == matrix[i + 1][j + 1]) {
                    isPretty = false;
                }
            }
        }

        if (isPretty) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}