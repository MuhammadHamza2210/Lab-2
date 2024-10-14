
package encap;
public class EquationsCalculator {

    public static void main(String[] args) {
        // Given values
        int x = 6;
        int y = 20;
        int z = 13;

        // Calculating the equations
        int eq1 = 2 * (x * x) + (y * y); // 2x^2 + y^2
        int eq2 = 3 * x + y - 3 * (z * z); // 3x + y - 3z^2
        int eq3 = 2 * x - 2 * y + 5 * (z * z); // 2x - 2y + 5z^2

        // Output the results
        System.out.println("Equation 1: 2x^2 + y^2 = " + eq1);
        System.out.println("Equation 2: 3x + y - 3z^2 = " + eq2);
        System.out.println("Equation 3: 2x - 2y + 5z^2 = " + eq3);
    }
}


    

