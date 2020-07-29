import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int current = 0;
        int numElements = input.nextInt();

        for (int i = 0; i < numElements; i++) {
            current = input.nextInt();
            if (current % 4 == 0 && current > max) {
                max = current;
            }
        }

        System.out.println(max);
    }
}