
import java.util.Scanner;

public class KMaxAndMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min, max;

        // Find minimum
        if (a < b && a < c)
            min = a;
        else if (b < c)
            min = b;
        else
            min = c;

        // Find maximum
        if (a > b && a > c)
            max = a;
        else if (b > c)
            max = b;
        else
            max = c;

        System.out.println(min + " " + max);

        sc.close();
    }
}