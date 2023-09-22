package cz.filipvojtech.utility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtility {
    /**
     * Gets a number from the user and validates it.
     * In case the input was invalid, the user is informed and asked to input a number again.
     *
     * @param prompt Informative text displayed to the user
     * @return The user supplied number
     */
    public static int getValidInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(prompt);
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("That is not a number. Please try again.");
                sc.nextLine();
            }
        }
    }

    /**
     * Gets a number from the user from a range and validates it.
     * In case the input was invalid or outside the range, the user is informed and asked to input a number again.
     *
     * @param prompt Informative text displayed to the user
     * @param lower The lower limit (inclusive) in the range
     * @param upper The upper limit (exclusive) in the range
     * @return The user supplied number in the range
     */
    public static int getValidInt(String prompt, int lower, int upper) {
        Scanner sc = new Scanner(System.in);
        int input;

        while (true) {
            System.out.println(prompt);
            try {
                input = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("That is not a number. Please try again.");
                sc.nextLine();
                continue;
            }

            if (input <= lower || input > upper) {
                System.out.println("Number is outside of the allowed range. Please try again.");
                continue;
            }

            return input;
        }
    }
}
