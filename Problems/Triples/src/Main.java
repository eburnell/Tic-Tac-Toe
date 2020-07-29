import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int numTriplets = 0;

        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < length - 2; i++) {
            if (numbers[i] + 1 == numbers[i + 1] &&
            numbers[i + 1] + 1 == numbers[i + 2]) {
                numTriplets++;
            }
        }

        System.out.println(numTriplets);
    }
}