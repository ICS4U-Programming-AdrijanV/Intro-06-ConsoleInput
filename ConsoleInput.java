/**
* Get the radius from the user to calculate
* the volume of a sphere.
*
* @author  Adrijan Vranjkovic
* @version 1.0
* @since   2023-02-10
*/

// Importing
import java.util.Scanner;
// Making class
public final class ConsoleInput {

    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
     volume = 0
     radiusDouble = 0
    private ConsoleInput() {
        throw new IllegalStateException("Utility class.");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Using scanner to get user input
        System.out.println("What is the radius in centimeters?");
        Scanner scanner = new Scanner(System.in);
        String userRadius = scanner.nextLine();
        // Make user input a double.
        double radiusDouble = Double.parseDouble(userRadius);
        // Check for valid input.
        if (radiusDouble < 0) {
            System.out.println("This is a negative value.");
        } else if (radiusDouble > 0) {

            // Calculate
            double volume = ((4.0 / 3.0) * Math.PI) * Math.pow(radiusDouble, 3);
            // Print volume.
            System.out.println("The total volume is : "
                 + String.format("%.2f", volume) + " cm^3.");
        } else {
            System.out.println("This not a possible input.");
        }
        // Close scanner.
        scanner.close();
    }
}
