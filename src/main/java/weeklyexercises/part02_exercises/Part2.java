package weeklyexercises.part02_exercises;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

import static cz.filipvojtech.util.Array.findMax;
import static weeklyexercises.part02_exercises.utils.ExerciseUtilities.*;
import static weeklyexercises.part02_exercises.utils.FileHandlingUtilities.readNumericFile;

public class Part2 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 10, 20, 60, 10, 5, 60, 5, 60};
        Scanner sc = new Scanner(System.in);
        int max = findMax(arr);
        String input;

        System.out.println("Input a name of a file you want to read from:");
        input = sc.nextLine();
        int[] fileArr = readNumericFile(input);

        System.out.println(MessageFormat.format("The largest number in the array: {0}", max));
        System.out.println(MessageFormat.format("The number {0} is in the {1} position from the beginning and {2} position from the back", max, getFirstPos(arr, max), getLastPos(arr, max)));
        System.out.println(MessageFormat.format("The array in the code {0} identical with the array from the file", checkIdentical(arr, fileArr) ? "is" : "isn't"));
        System.out.println("Reversed code array: " + Arrays.toString(reverse(arr)));
        reverseInPlace(fileArr);
        System.out.println("Reversed file array: " + Arrays.toString(fileArr));
    }
}
