import java.util.Scanner;

public class HTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        double x = (double) a / b;

        // Floor
        int floor;
        if (x >= 0 || x == (int) x)
            floor = (int) x;
        else
            floor = (int) x - 1;

        // Ceil
        int ceil;
        if (x <= 0 || x == (int) x)
            ceil = (int) x;
        else
            ceil = (int) x + 1;

        // Round (Half Up)
        int round;
        int integer = (int) x;
        double fraction = x - integer;

        if (x >= 0) {
            if (fraction >= 0.5)
                round = integer + 1;
            else
                round = integer;
        } else {
            if (fraction <= -0.5)
                round = integer - 1;
            else
                round = integer;
        }

        System.out.println("floor " + a + " / " + b + " = " + floor);
        System.out.println("ceil " + a + " / " + b + " = " + ceil);
        System.out.println("round " + a + " / " + b + " = " + round);

        sc.close();
    }
}