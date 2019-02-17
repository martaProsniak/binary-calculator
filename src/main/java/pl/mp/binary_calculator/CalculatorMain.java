package pl.mp.binary_calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Converts an integer between 0 and 15 into binary
 *
 * @author Marta
 */

public class CalculatorMain {

    /**
     * application starting method
     *
     * @param args Command line application starting arguments.
     */
    public static void main(String[] args) {

        //New Scanner object for reading user input
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter number to convert it into binary:");
        //Assign user input to new variable

        if (!inputScanner.hasNextInt()) {
            System.out.println("Wrong vale - choose an integer!");
        }
        int number = inputScanner.nextInt();

        if (number < 0) {
            System.out.println("Choose number higher than 0!");
        } else {
            //Create new int array
            List<Integer> binaryNumber = new ArrayList<>();
            //Convert number into binary and store result in a list
            while (number > 0) {
                int result = number % 2;
                binaryNumber.add(result);
                number /= 2;
            }
            for (int i = binaryNumber.size() - 1; i >= 0; i--) {
                System.out.print(binaryNumber.get(i));
            }
        }
    }
}

