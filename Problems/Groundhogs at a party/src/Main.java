import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        
        boolean weekendSuccess = weekend && numCups >= 15 && numCups <= 25;
        boolean weekSuccess = !weekend && numCups >= 10 && numCups <= 20;
        
        System.out.println(weekendSuccess || weekSuccess);
    }
}
