/**
* Get the radius from the user to calculate
* the volume of a sphere.
*
* @author  Adrijan Vranjkovic
* @version 1.0
* @since   2023-02-10
*/

//Importing
import java.util.Scanner;

public final class ConsoleInput {

    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private ConsoleInput() {
        throw new IllegalStateException("Utility class.");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        //Using scanner to get user input
        Scanner scanner = new Scanner(System.in);
        String userRadius = scanner.nextLine();
        
        //calculating
        double radiusDouble = Double.parseDouble(userRadius);
        if (radiusDouble < 0) {
            System.out.println("This is a negative value.");
        }
        double volume = ((3.0 / 4.0) * Math.PI) * Math.pow(radiusDouble, 3);

        System.out.println("The total volume is " + (volume));
        
        scanner.close();
    }
}
