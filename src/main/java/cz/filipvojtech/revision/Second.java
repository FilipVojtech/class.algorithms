package cz.filipvojtech.revision;

import java.awt.*;
import java.util.Scanner;
import java.util.Timer;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height, width;

        while (true) {
            System.out.println("Height:");
            System.out.println();
            try {
                height = sc.nextDouble();
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Please enter a number.");
                continue;
            }
            break;
        }

        while (true) {
            System.out.println("Width:");
            try {
                width = sc.nextDouble();
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Please enter a number.");
                continue;
            }
            break;
        }

        {
            String row = "";
            for (int i = 0; i < width; i++) {
                row += "*";
            }

            for (int i = 0; i < height; i++) {
                System.out.println(row);
            }
        }
    }
}
