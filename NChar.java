import java.util.Scanner;

public class NChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        if (c >= 'a' && c <= 'z') {
            System.out.println((char)(c - 32));
        } else {
            System.out.println((char)(c + 32));
        }

        sc.close();
    }
}