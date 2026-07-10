import java.util.Scanner;

public class MCapitalOrSmallOrDigit
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char c = s.charAt(0);

        if(c>='A' && c<='Z')
        {
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");
        }
        else if(c>='a' && c<='z')
        {
             System.out.println("ALPHA");
            System.out.println("IS SMALL");
        }
        else if(c>='0' && c<='9')
        {
            System.out.println("IS DIGIT");
        }
        sc.close();
    }
}