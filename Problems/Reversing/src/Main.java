import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        int right = num % 10;
        if (right != 0) {
            System.out.print(right);
        }
        num = num / 10;
        int middle = num % 10;
        System.out.print(middle);
        num = num / 10;
        System.out.print(num);
    }
}
