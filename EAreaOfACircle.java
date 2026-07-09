import java.util.Scanner;

public class EAreaOfACircle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double area = 3.141592653*r*r;
        System.out.printf(" %.9f ",area);
        sc.close();
    }
}