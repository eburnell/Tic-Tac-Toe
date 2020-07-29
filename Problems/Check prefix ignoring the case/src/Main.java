import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String test = input.nextLine();
        
        if (test.charAt(0) == 'J' || test.charAt(0) == 'j') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
