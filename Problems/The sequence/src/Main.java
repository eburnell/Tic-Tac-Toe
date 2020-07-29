import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int totalItems = input.nextInt();
        int counter = 0;

        for (int i = 1; i <= totalItems; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                counter++;
                if (counter == totalItems) {
                    break;
                }
            }
            if (counter == totalItems) {
                break;
            }
        }
    }
}