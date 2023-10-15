package weeklyexercises.part01_exercises.utils;

/**
 * @author michelle
 */
public class ExerciseUtilities {
    // This class should contain your isOdd method. For utility methods
    // such as this one, i.e. one where there's no stored data, it's just
    // calculating a result and returning it without saving anything, or using any
    // saved information, it's better practice to make the method static
    //
    // e.g. public static void sayHello(String name)
    // This would print out "Hello, $name", i.e. the name contained in the name
    // variable.
    // There's no information saved, there's no information used that isn't
    // supplied as a method parameter, so there's no point in making it an
    // instance method, i.e. a method tied to a specific instance of a class

    /**
     * Check if supplied number is odd
     *
     * @param number The checked number
     * @return True when number is odd, False otherwise
     */
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    /**
     * Removes odd numbers from an array by multiplying them by 2
     *
     * @param numbers Array of numbers to even out
     */
    public static void evenOut(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (isOdd(numbers[i])) {
                numbers[i] = numbers[i] * 2;
            }
        }
    }

    /**
     * Looks for the longest string in an array.
     *
     * @param strings The array of strings
     * @return The longest string from the array.
     * If the array is empty, the returned value is null.
     */
    public static String findLongest(String[] strings) {
        if (strings.length < 1) return null;

        String longest = strings[0];
        int length = strings[0].length();

        for (int i = 1; i < strings.length; i++) {
            var string = strings[i];
            int currentLength = string.length();
            if (currentLength > length) {
                longest = string;
                length = currentLength;
            }
        }

        return longest;
    }
}
