package cz.filipvojtech.revision;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        float sum = 0, number=0;

        // Start taking in numbers
        while (number != -1) {
            // Inform user
            System.out.println("Enter a number:");

            try {
                // Get input
                number = sc.nextFloat();
            } catch (NumberFormatException e) {
                System.out.println("Entered string is not a number");
                sc.nextLine();
                continue;
            }

            sum += number;
            i++;
        }

        sum += 1;
        i--;

        System.out.println("The average is " + (sum / i));
    }
}
