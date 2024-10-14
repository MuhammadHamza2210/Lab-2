
package encap;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        // Calculate sum, difference, and product
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        // Output the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        // Close the scanner
        sc.close();
    }
}
