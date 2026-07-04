import java.util.Scanner;

/*
 * Sort Three Numbers (Ascending Order)
 *
 * ---------------------------------------------------
 * Problem:
 * Read three integers and print them in ascending order
 * while also preserving and printing their original order.
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Read three numbers from the user.
 *
 * Step 2:
 * Store their original values in separate variables.
 *
 * Step 3:
 * Compare the first two numbers.
 * If they are not in ascending order, swap them.
 *
 * Step 4:
 * Compare the last two numbers.
 * If they are not in ascending order, swap them.
 *
 * Step 5:
 * After swapping b and c, compare a and b again.
 * This ensures all three numbers are in ascending order.
 *
 * Step 6:
 * Print the sorted numbers.
 *
 * Step 7:
 * Print the original numbers.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Input:
 * a = 30
 * b = 10
 * c = 20
 *
 * Original:
 * x = 30
 * y = 10
 * z = 20
 *
 * First Comparison:
 * a > b
 * 30 > 10 ✔
 *
 * Swap:
 * a = 10
 * b = 30
 * c = 20
 *
 * Second Comparison:
 * b > c
 * 30 > 20 ✔
 *
 * Swap:
 * a = 10
 * b = 20
 * c = 30
 *
 * Final Check:
 * a > b
 * 10 > 20 ✘
 *
 * Final Sorted Order:
 * 10
 * 20
 * 30
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * While sorting, the original values would be lost.
 *
 * Therefore, copies of the original numbers are stored
 * in variables x, y, and z before sorting.
 *
 * This allows us to print:
 * 1. Sorted order
 * 2. Original order
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * O(1)
 *
 * Only a fixed number of comparisons and swaps are
 * performed regardless of the input values.
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(1)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * For only three numbers, sorting can be done using
 * simple comparisons and swaps.
 *
 * No loops or arrays are required.
 */

public class TSortNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read three integers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // ---------------------------------------------------
        // Store original values before sorting.
        // ---------------------------------------------------
        int x = a;
        int y = b;
        int z = c;

        // ---------------------------------------------------
        // Compare first and second numbers.
        // Swap if they are in the wrong order.
        // ---------------------------------------------------
        if (a > b) {

            int temp = a;
            a = b;
            b = temp;
        }

        // ---------------------------------------------------
        // Compare second and third numbers.
        // Swap if necessary.
        // ---------------------------------------------------
        if (b > c) {

            int temp = b;
            b = c;
            c = temp;

            // ---------------------------------------------------
            // After swapping b and c,
            // a may again become greater than b.
            // Perform one final comparison.
            // ---------------------------------------------------
            if (a > b) {

                int temp1 = a;
                a = b;
                b = temp1;
            }
        }

        // ---------------------------------------------------
        // Print numbers in ascending order.
        // ---------------------------------------------------
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Blank line (as required by the problem).
        System.out.println();

        // ---------------------------------------------------
        // Print numbers in their original order.
        // ---------------------------------------------------
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}