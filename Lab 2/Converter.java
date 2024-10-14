
package encap;


public class Converter {
   public static void main(String[] args) {
        // Celsius temperatures to convert
        double celsius1 = 289;
        double celsius2 = 400;
        double celsius3 = -36;
        double celsius4 = -180;

        // Calculate Fahrenheit for each temperature
        double fahrenheit1 = (celsius1 * 9 / 5) + 32;
        double fahrenheit2 = (celsius2 * 9 / 5) + 32;
        double fahrenheit3 = (celsius3 * 9 / 5) + 32;
        double fahrenheit4 = (celsius4 * 9 / 5) + 32;

        // Output the results without degree symbol
        System.out.printf("%.1f C = %.1f F%n", celsius1, fahrenheit1);
        System.out.printf("%.1f C = %.1f F%n", celsius2, fahrenheit2);
        System.out.printf("%.1f C = %.1f F%n", celsius3, fahrenheit3);
        System.out.printf("%.1f C = %.1f F%n", celsius4, fahrenheit4);
    }
}


   