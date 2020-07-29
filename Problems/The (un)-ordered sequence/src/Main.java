import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ascending = false;
        boolean descending = false;
        int lastNum = input.nextInt();
        int num = input.nextInt();
        
        while (lastNum == num) {
            lastNum = num;
            num = input.nextInt();
        }
        
        if (lastNum > num) {
            descending = true;
        } else {
            ascending = true;
        }

        if (ascending) {
            while (lastNum <= num && num != 0) {
                lastNum = num;
                num = input.nextInt();
            }
            if (num < lastNum && num != 0) {
                ascending = false;
            }
        } else if (descending) {
            while (lastNum >= num && num != 0) {
                lastNum = num;
                num = input.nextInt();
            }
            if (num > lastNum) {
                descending = false;
            }
        }

        if (ascending || descending) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
