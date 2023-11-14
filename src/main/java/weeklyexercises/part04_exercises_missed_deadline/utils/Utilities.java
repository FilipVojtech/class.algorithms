package weeklyexercises.part04_exercises_missed_deadline.utils;

public class Utilities {
    /**
     * Deletes a value on a specified position and shifts the array
     *
     * @param array    The array to be deleted from
     * @param position The position to delete
     * @return The deleted value if successful, otherwise the minimum value of an integer
     */
    public static int shiftDelete(int[] array, int position) {
        // Input: A source array (of ints) and the position to overwrite (an int)
        // Output: Output: The value that was deleted (an int)

        // If position is < 0 or position >= length of array:
        //     Return hard-coded error value
        if (position < 0 || position >= array.length) {
            return Integer.MIN_VALUE;
        }
        // Save value in position to variable (deleted)
        int deleted = array[position];
        // Loop through source array, starting at position and looping to length of array -1:
        //     Set source[i] to source[i+1]
        for (int i = position; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        // Set last position in source array to default value (0)
        array[array.length - 1] = 0;
        // return deleted value
        return deleted;
    }

    /**
     * Overwrites a value with default one in the specified position
     *
     * @param array    Array to delete from
     * @param position Position to delete from
     * @return The deleted value if successful, otherwise the minimum value of an integer
     */
    public static int overwriteDelete(int[] array, int position) {
        // Input: A source array (of ints) and the position to overwrite (an int)
        // Output: The value that was deleted (an int)

        // If position is < 0 or position >= length of array
        //     Return hard-coded error value
        if (position < 0 || position >= array.length) {
            return Integer.MIN_VALUE;
        }
        // Store value in specified position in a variable (deleted)
        int deleted = array[position];
        // Set specified position in array to a blank (0 as its a number)
        array[position] = 0;
        // Return deleted value variable
        return deleted;
    }
}
