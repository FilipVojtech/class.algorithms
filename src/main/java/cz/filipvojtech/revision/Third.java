package cz.filipvojtech.revision;

import cz.filipvojtech.utility.InputUtility;

public class Third {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        numbers[0] = InputUtility.getValidInt("Please enter a number 1/3:");
        numbers[1] = InputUtility.getValidInt("Please enter a number 2/3:");
        numbers[2] = InputUtility.getValidInt("Please enter a number 3/3:");

        System.out.println("The biggest number of them is " + CalcMax.findMax(numbers));
    }
}
