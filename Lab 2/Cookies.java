
package encap;
import java.util.Scanner;
public class Cookies {
    

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for total cookies produced
        System.out.print("Enter the total number of cookies produced: ");
        int totalCookies = sc.nextInt();

        // Constants
        int cookiesPerBox = 12;
        double boxPrice = 1.14;
        int boxesPerCarton = 24;
        double leftoverBoxPrice = 0.57;

        // Calculations
        int totalBoxes = totalCookies / cookiesPerBox; // Total number of boxes
        int totalCartons = totalBoxes / boxesPerCarton; // Total number of cartons
        int leftoverBoxes = totalBoxes % boxesPerCarton; // Leftover boxes
        int remainingCookies = totalCookies % cookiesPerBox; // Remaining cookies

        // Calculate money made
        double moneyMadeFromFullBoxes = (totalBoxes - leftoverBoxes) * boxPrice; // Money from full boxes
        double moneyMadeFromLeftoverBoxes = leftoverBoxes * leftoverBoxPrice; // Money from leftover boxes
        double totalMoneyMade = moneyMadeFromFullBoxes + moneyMadeFromLeftoverBoxes; // Total money made

        // Display results
        System.out.println("Total boxes: " + totalBoxes);
        System.out.println("Total cartons: " + totalCartons);
        System.out.println("Leftover boxes: " + leftoverBoxes);
        System.out.println("Remaining cookies given away for free: " + remainingCookies);
        System.out.printf("Total money made: $%.2f%n", totalMoneyMade);
        
        sc.close();
    }
}


