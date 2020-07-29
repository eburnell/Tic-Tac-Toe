import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long m = input.nextLong();
        int n = 0;
        long f = 1;
        boolean solved = false;

        while (!solved) {
            n++;
            f = 1;
            for (int i = n; i > 0; i--) {
                f = f * i;
            }

            if (f > m) {
                solved = true;
            }
        }

        System.out.println(n);
    }
}
