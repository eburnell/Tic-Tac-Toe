import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numRows = input.nextInt();
        int numSeats = input.nextInt();
        int[][] theater = new int[numRows][numSeats];

        //populate theater
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numSeats; j++) {
                theater[i][j] = input.nextInt();
            }
        }

        int needSeats = input.nextInt();
        int countOfFreeSeats = 0;
        int availableRow = -1;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numSeats; j++) {
                if (theater[i][j] == 0) {
                    countOfFreeSeats++;
                    if (countOfFreeSeats == needSeats
                        && availableRow == -1) {
                        availableRow = i;
                    }
                } else { //if == 1
                    countOfFreeSeats = 0;
                }
            }
            countOfFreeSeats = 0;
        }

        if (availableRow >= 0) {
            System.out.println(availableRow + 1);
        } else {
            System.out.println(0);
        }

    }
}