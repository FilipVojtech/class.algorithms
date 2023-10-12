package cz.filipvojtech.revision;

import cz.filipvojtech.util.InputUtility;

public class Third {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        numbers[0] = InputUtility.getInt("Please enter a number 1/3:");
        numbers[1] = InputUtility.getInt("Please enter a number 2/3:");
        numbers[2] = InputUtility.getInt("Please enter a number 3/3:");

        System.out.println("The biggest number of them is " + CalcMax.findMax(numbers));
    }
}
