package weeklyexercises.part_06_exercise;

import cz.filipvojtech.util.Array;
import cz.filipvojtech.util.InputUtility;
import weeklyexercises.part_06_exercise.utils.FileHandlingUtilities;
import weeklyexercises.part_06_exercise.utils.NumberUtilities;

/**
 * @author michelle
 */
public class Part6Inserting {
    public static void main(String[] args) {
        int[] numbers = FileHandlingUtilities.readNumericFile("SampleInput/Part6Des.txt");
        System.out.println("Numbers in question:");
        System.out.println(Array.toString(numbers, ", "));
        int[] newNums = getChoiceArray(numbers);
        System.out.println("The new array is");
        System.out.println(Array.toString(newNums, ", "));
    }

    private static int[] getChoiceArray(int[] array) {
        while (true) {
            System.out.println("Your options are:");
            System.out.println("    'insert asc'   Insert a value to a sorted array in ascending order");
            System.out.println("    'insert des'   Insert a value to a sorted array in descending order");
            System.out.println("       'replace'   Replace all values specified by a different value");
            System.out.println("          'help'   Display this message");
            System.out.println("          'exit'   Stop the program");
            String input = InputUtility.getString("What would you like to do with these numbers?");
            int value;
            switch (input.toLowerCase()) {
                case "replace":
                    value = InputUtility.getInt("Replaced value:");
                    int replacement = InputUtility.getInt("Replace with:");
                    int changed = NumberUtilities.replace(array, value, replacement);
                    System.out.println(changed + " values were replaced.");
                    break;
                case "insert asc":
                    value = InputUtility.getInt("Value to be inserted:");
                    NumberUtilities.shiftInsert(array, value);
                    break;
                case "insert des":
                    value = InputUtility.getInt("Value to be inserted:");
                    array = NumberUtilities.resizeInsert(array, value);
                    break;
                case "help":
                    continue;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry, that is not a valid choice.\n");
                    continue;
            }
            break;
        }
        return array;
    }
}
