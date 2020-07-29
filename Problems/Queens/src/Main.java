import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        
        double slope = Math.abs((y2 * 1.0 - y1) / (x2 * 1.0 - x1));
        if (x1 == x2 || y1 == y2 || slope == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
