import java.util.Scanner;

public class LTheBrothers
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String s4 = sc.next();

        if(s2.equals(s4))
        {
            System.out.println("ARE Brothers");
        }
        else 
        {
            System.out.println("NOT");
        }

        sc.close();
    }
}