
package encap;
import java.util.Scanner;

public class PulleyFormulas {
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the speed of one pulley:");
        System.out.print("Enter the diameter of Pulley 1 (in units): ");
        double diameter1 = sc.nextDouble();
        System.out.print("Enter the diameter of Pulley 2 (in units): ");
        double diameter2 = sc.nextDouble();
        System.out.print("Enter the RPM of Pulley 1: ");
        double rpm1 = sc.nextDouble();
        double rpm2 = (diameter1 / diameter2) * rpm1;
        System.out.printf("The RPM of Pulley 2 is: %.2f RPM%n", rpm2);
        System.out.println("\nCalculate the weight that can be lifted:");
        System.out.print("Enter the force exerted (in units): ");
        double forceExerted = sc.nextDouble();
        System.out.print("Enter the number of up ropes: ");
        int numberOfUpRopes = sc.nextInt();
        double weightLifted = forceExerted * numberOfUpRopes;
        System.out.printf("The weight that can be lifted is: %.2f units%n", weightLifted);
                    sc.close();
    }
}



