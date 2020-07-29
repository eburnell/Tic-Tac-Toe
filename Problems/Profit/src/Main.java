import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double m = input.nextInt();
        double p = input.nextInt();
        p = p / 100.00;
        double k = input.nextInt();
        int years = 0;

        if (m != k) {
            do {
                m = m + m * p;
                years++;
            } while (m < k);
        }

        System.out.println(years);
        
    }
}
