package cz.filipvojtech.util;

import java.io.File;
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
    public static int getInt(String prompt) {
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
     * @param lower  The lower limit (inclusive) in the range
     * @param upper  The upper limit (exclusive) in the range
     * @return The user supplied number in the range
     */
    public static int getInt(String prompt, int lower, int upper) {
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

            if (input < lower || input >= upper) {
                System.out.println("Number is outside of the allowed range: < " + lower + "; " + upper + " ). Please try again.");
                continue;
            }

            return input;
        }
    }

    /**
     * Gets a string from the user and validates it.
     * In case the input was invalid, the user is informed and asked for input again.
     *
     * @param prompt Informative text displayed to the user
     * @return The user supplied number
     */
    public static String getString(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }

    /**
     * Get a specified number of string from the user
     *
     * @param length Numbe of words
     * @return An array of the words entered
     */
    public static String[] getStringArray(int length) {
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            array[i] = getString("Word " + (i + 1) + ":");
        }
        return array;
    }

    /**
     * Prompts the user for a yes/no question
     * The question is repeated until a valid choice is made
     *
     * @param prompt The prompt to ask the user
     * @return true if the user selects yes, false if no
     */
    public static boolean promptYesNo(String prompt) {
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println(prompt + "[y/n]");
            input = sc.nextLine();
            switch (input.toLowerCase()) {
                case "yes", "y":
                    return true;
                case "no", "n":
                    return false;
            }
        }
    }

    /**
     * Get an existing file from the user. The input is validated to be an existing file.
     *
     * @param prompt Message to the user of what is expected
     * @return The input from the user.
     */
    public static String getExistingFileName(String prompt) {
        String fName;
        File f;
        while (true) {
            fName = getString(prompt);
            f = new File(fName);
            if (!f.exists()) {
                System.out.println(Messages.FILE_NOT_EXISTS);
            } else break;
        }
        return fName;
    }
}
