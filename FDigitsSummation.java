import java.util.Scanner;

/*
 * Digits Summation (Using String)
 *
 * ---------------------------------------------------
 * Problem:
 * Given two very large integers, find the sum
 * of their last digits.
 *
 * Since the numbers can be as large as 10^18,
 * storing them in an int is not possible.
 *
 * Therefore, we read them as Strings.
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Read both numbers as Strings.
 *
 * Step 2:
 * Extract the last character of each String.
 *
 * Step 3:
 * Convert the digit characters ('0'...'9')
 * into integers (0...9).
 *
 * Step 4:
 * Add both digits.
 *
 * Step 5:
 * Print the result.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Input:
 *
 * 123456
 * 987654
 *
 * Last Character:
 *
 * x = '6'
 * y = '4'
 *
 * Convert to Integer:
 *
 * p = '6' - '0'
 *   = 54 - 48
 *   = 6
 *
 * q = '4' - '0'
 *   = 52 - 48
 *   = 4
 *
 * Sum:
 *
 * 6 + 4 = 10
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Characters are internally stored using
 * Unicode values (ASCII values for English characters).
 *
 * Every character has an integer value.
 *
 * Example:
 *
 * Character    ASCII Value
 * -------------------------
 * '0'             48
 * '1'             49
 * '2'             50
 * ...
 * '9'             57
 *
 * 'A'             65
 * 'B'             66
 * ...
 * 'Z'             90
 *
 * 'a'             97
 * 'b'             98
 * ...
 * 'z'             122
 *
 * ---------------------------------------------------
 * Character to Integer Conversion
 *
 * Example:
 *
 * char ch = '8';
 *
 * int num = ch - '0';
 *
 * Explanation:
 *
 * '8'
 * =
 * ASCII 56
 *
 * '0'
 * =
 * ASCII 48
 *
 * Therefore,
 *
 * 56 - 48 = 8
 *
 * Result:
 *
 * num = 8
 *
 * ---------------------------------------------------
 * Integer to Character Conversion
 *
 * Suppose:
 *
 * int num = 5;
 *
 * char ch = (char)(num + '0');
 *
 * Explanation:
 *
 * 5 + 48
 * =
 * 53
 *
 * ASCII 53
 * =
 * '5'
 *
 * Result:
 *
 * ch = '5'
 *
 * ---------------------------------------------------
 * Character to Integer (ASCII Value)
 *
 * char ch = 'A';
 *
 * int value = ch;
 *
 * value = 65
 *
 * Because characters are stored as integers.
 *
 * ---------------------------------------------------
 * Integer (ASCII) to Character
 *
 * int value = 66;
 *
 * char ch = (char)value;
 *
 * ch = 'B'
 *
 * ---------------------------------------------------
 * Frequently Used ASCII Values
 *
 * Digits:
 *
 * '0' = 48
 * '9' = 57
 *
 * Uppercase:
 *
 * 'A' = 65
 * 'Z' = 90
 *
 * Lowercase:
 *
 * 'a' = 97
 * 'z' = 122
 *
 * Difference:
 *
 * 'a' - 'A'
 * = 32
 *
 * ---------------------------------------------------
 * Useful Character Tricks
 *
 * Convert Uppercase to Lowercase:
 *
 * char lower = (char)(ch + 32);
 *
 * Example:
 *
 * 'A'
 * ↓
 * 'a'
 *
 * ---------------------------------------------------
 * Convert Lowercase to Uppercase:
 *
 * char upper = (char)(ch - 32);
 *
 * Example:
 *
 * 'b'
 * ↓
 * 'B'
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * O(1)
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(1)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Character to Digit:
 *
 * digit = ch - '0'
 *
 * Digit to Character:
 *
 * ch = (char)(digit + '0')
 *
 * Character to ASCII:
 *
 * int value = ch;
 *
 * ASCII to Character:
 *
 * char ch = (char)value;
 */

public class FDigitsSummation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the numbers as Strings.
        // This avoids overflow for very large numbers.
        String a = sc.next();
        String b = sc.next();

        // ---------------------------------------------------
        // Extract the last character of each String.
        // ---------------------------------------------------
        char x = a.charAt(a.length() - 1);
        char y = b.charAt(b.length() - 1);

        // ---------------------------------------------------
        // Convert character digits into integers.
        //
        // Example:
        //
        // '7' - '0'
        //
        // 55 - 48
        //
        // = 7
        // ---------------------------------------------------
        int p = x - '0';
        int q = y - '0';

        // Print the sum of the last digits.
        System.out.println(p + q);

        sc.close();
    }
}