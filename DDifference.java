import java.util.Scanner;

public class DDifference
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        long a =  sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        System.out.println("Difference = "+((a*b)-(c*d)));
        sc.close();
    }
}