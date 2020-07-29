import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String cityName = input.nextLine();
        System.out.println(cityName.endsWith("burg"));
    }
}