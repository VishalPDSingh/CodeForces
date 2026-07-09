import java.util.Scanner;

public class BBasicDataTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        long b = sc.nextLong();
        char ch = sc.next().charAt(0);
        float fl = sc.nextFloat();
        double d = sc.nextDouble();

        System.out.println(a);
        System.out.println(b);
        System.out.println(ch);
        System.out.println(fl);
         System.out.printf("%.1f%n", d);

        sc.close();
    }
}