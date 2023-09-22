package cz.filipvojtech.revision;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtility {
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

    public static int getValidInt(String prompt, int min, int max) {
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

            if (input < min || input > max) {
                System.out.println("Number is outside of the allowed range. Please try again.");
                continue;
            }

            return input;
        }
    }
}
