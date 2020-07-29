import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        for (int i = 0; i <= 1000; i++) {
            if (a * Math.pow(i, 3) +
                    b * Math.pow(i, 2) +
                    c * i + d == 0) {
                System.out.println(i);
            }
        }
    }
}